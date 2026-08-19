class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                // System.out.println(sum);
                if(j-i>=1 && sum%k==0)return true;
            }
        }return false;
    }
}