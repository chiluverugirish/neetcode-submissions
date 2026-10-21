class Solution {
    int dfs(int[]arr,int i,int k,int dp[]){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int max=arr[i],smax=arr[i];
        for(int j=0;j+i<arr.length&&j<k;j++){
            smax=Math.max(smax,arr[i+j]);
            max=Math.max(dfs(arr,i+j+1,k,dp)+smax*(j+1),max);
            dp[i]=max;
        }
        return dp[i];
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return dfs(arr,0,k,dp);
    }
}
