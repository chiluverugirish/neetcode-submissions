class Solution {
    static boolean issub(int i,int j,String s,String t){
        if(j==t.length())return false;
        
        if(i==s.length()-1){
            if(s.charAt(i)==t.charAt(j))return true;
        }
        if(s.charAt(i)==t.charAt(j)){
            return issub(i+1,j+1,s,t);
        }
        if(issub(i,j+1,s,t))return true;
        return false;
    }
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())return false;
        if(s.length()==0)return true;
        return issub(0,0,s,t);
    }
}