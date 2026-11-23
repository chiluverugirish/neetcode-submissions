class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i:nums){
            cs=Math.max(cs+i,i);
            ms=Math.max(ms,cs);
        }
        return ms;
    }
}
