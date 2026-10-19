class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        long bad = 0;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i, good = counts.getOrDefault(key, 0);
            bad += i - good;
            counts.put(key, good + 1);
        }
        return bad;
    }
}
