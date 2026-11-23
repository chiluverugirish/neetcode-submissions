class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if(nums.length==1)return Math.abs(nums[0]);
        int min=0,max=0;
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            s1=Math.max(s1+nums[i],nums[i]);
            s2=Math.min(s2+nums[i],nums[i]);
            max=Math.max(s1,max);
            min=Math.min(s2,min);
        }
        return Math.max(Math.abs(max),Math.abs(min));
    }
}
