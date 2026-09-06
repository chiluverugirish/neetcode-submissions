class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans=1;
        for(int i=0;i<nums.length;i++){
            int max=nums[i],min=nums[i];
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                if(max-min<=limit){
                    ans=Math.max(ans,j-i+1);
                }else break;
            }
        }return ans;
    }
}