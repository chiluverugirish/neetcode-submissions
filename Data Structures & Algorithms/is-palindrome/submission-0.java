class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        if(s.length()==0)return true;
        s=s.toLowerCase();
        StringBuilder ns=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))ns.append(s.charAt(i)+"");
        }if(ns.length()==0)return true;
        int start=0,end=ns.length()-1;
        
        while(start<=end){
            if(ns.charAt(start)==ns.charAt(end)){start++;end--;}
            else return false;
        }
        return true;
    }
}
