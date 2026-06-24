class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int de=1,in=1,n=nums.length,mx=0,mn=0;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]>nums[i]){
                in++;
            }else{
                mx=Math.max(mx,in);
                in=1;
            }
        }
        mx=Math.max(mx,in);
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i]){
                de++;
            }else{
                mn=Math.max(mn,de);de=1;
            }
        }
        mn=Math.max(mn,de);
        return Math.max(mn,mx);
    }
}