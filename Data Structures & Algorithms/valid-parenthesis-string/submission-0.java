class Solution {
    boolean rec(char[]ch,int i,int left){
        if(i==ch.length){
           return left==0;
        }
        if(left<0)return false;
        if(ch[i]=='(')left++;
        else if(ch[i]==')')left--;
        else{
            // if(rec(ch,i+1,left))return true;
            if(rec(ch,i+1,left-1))return true;
            if(rec(ch,i+1,left+1))return true;
        }
        if(rec(ch,i+1,left))return true;
        return false;
    }
    public boolean checkValidString(String s) {
        char ch[]=s.toCharArray();
        return rec(ch,0,0);
    }
}