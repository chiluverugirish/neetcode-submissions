class Solution {
    static int rec(char ch[],String word,int i,int j,int dp[][]){
        if(i>=ch.length){
            return word.length()-j;
        }
        if(j>=word.length()){
            return ch.length-i;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int val=0;
        if(ch[i]==word.charAt(j)){
            val=rec(ch,word,i+1,j+1,dp);
        }else{
            int b=rec(ch,word,i+1,j,dp);//del
            int c=rec(ch,word,i+1,j+1,dp);//ins
            int a=rec(ch,word,i,j+1,dp);//ins
            val=Math.min(c,Math.min(a,b))+1;
        }
        dp[i][j]=val;
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int i=0,j=0;
        int dp[][]=new int[word1.length()][word2.length()];
        for(int k=0;k<word1.length();k++)Arrays.fill(dp[k],-1);
        char ch1[]=word1.toCharArray();
        return rec(word1.toCharArray(),word2,0,0,dp);
    
    }
}
