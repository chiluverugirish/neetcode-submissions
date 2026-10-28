class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i:nums)max=Math.max(max,i);
        int count=0,ans=0;
        for(int i:nums){
            if(i==max)count++;
            else{
                ans=Math.max(ans,count);count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}
