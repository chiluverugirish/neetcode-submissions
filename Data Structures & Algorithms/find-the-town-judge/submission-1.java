class Solution {
    public int findJudge(int n, int[][] trust) {
        int mp[]=new int[n+1];
        boolean c[]=new boolean [n+1];
        for(int i[]:trust){
            int b=i[1];
            mp[b]++;
            c[i[0]]=true;
        }
        for(int i=1;i<=n;i++)if(mp[i]==n-1 && !c[i])return i;
        return -1;
    
    }
}