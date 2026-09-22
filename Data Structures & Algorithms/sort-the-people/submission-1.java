public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (i, j) -> Integer.compare(heights[j], heights[i]));

        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            res[i] = names[indices[i]];
        }

        return res;
    }
}