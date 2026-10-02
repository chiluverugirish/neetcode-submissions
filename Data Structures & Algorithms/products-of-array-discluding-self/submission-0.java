class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int suffix[]=new int[n];
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        
        int preffix=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=suffix[i]*preffix;
            preffix*=nums[i];
        }return ans;
    }
}  
