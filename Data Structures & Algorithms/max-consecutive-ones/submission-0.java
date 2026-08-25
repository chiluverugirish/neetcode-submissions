class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0,sum=0;
        for(int i:nums){
            if(i==1){
                sum+=i;
            }
            else{
                ans=Math.max(ans,sum);
                sum=0;
            }
        }
        ans=Math.max(ans,sum);
        return ans;

    }
}