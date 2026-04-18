class Solution {
    public int missingNumber(int[] nums) {
        int ans=0,ans1=0;
        for(int i=0;i<nums.length;i++){
            ans1=ans1^i;
            ans=ans^nums[i];
        }
        ans1=ans1^nums.length;
        return ans^ans1;
    }
}
