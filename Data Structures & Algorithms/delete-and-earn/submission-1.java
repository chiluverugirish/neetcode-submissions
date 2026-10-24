class Solution {
    public int deleteAndEarn(int[] nums) {
        int[]mp=new int[10001];
        for(int x:nums)mp[x]+=x;
        int prev=0,best=0;
        for(int s:mp){
            int next=Math.max(best,prev+s);
            prev=best;best=next;
        }
        return best;
    }
}