class Solution {
    static int rec(int[]coins,int amt,int i){
        if(amt==0){
            return 0;
        }
        if(i==-1)return Integer.MAX_VALUE;
        if(coins[i]>amt)return rec(coins,amt,i-1);
        int nottake=rec(coins,amt,i-1);
        int take=rec(coins,amt-coins[i],i);
        if(take!=Integer.MAX_VALUE)return Math.min(take+1,nottake);
        return nottake;
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int ans=rec(coins,amount,coins.length-1);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}