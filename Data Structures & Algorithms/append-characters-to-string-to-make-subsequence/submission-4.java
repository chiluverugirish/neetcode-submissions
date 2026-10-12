class Solution {
    // static int dfs(int i,int j,String s,String t){
    //     if(j>=t.length() || j>=s.length())return 0;
    //     if(i>=s.length())return t.length()-i;
    //     if(s.charAt(i)==t.charAt(j)){
    //         return (dfs(i+1,j+1,s,t),dfs(i+1,j,s,t));
    //     }
    //     return Math.min(dfs(i+1,j,s,t),dfs(i+1,j+1,s,t)+1);
    // }
    public int appendCharacters(String s, String t) {
      int i=0,j=0;
      while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;j++;
        }
        else i++;
      }
      return t.length()-j;
    }
}