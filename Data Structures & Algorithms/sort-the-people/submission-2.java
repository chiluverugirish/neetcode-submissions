class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer arr[]=new Integer[heights.length];
        for(int i=0;i<heights.length;i++)arr[i]=i;
        Arrays.sort(arr,(a,b)->{
            return heights[b]-heights[a];
        });
        String ans[]=new String[heights.length];
        for(int i=0;i<heights.length;i++)ans[i]=names[arr[i]];
        return ans;
    }
}