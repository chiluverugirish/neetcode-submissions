class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<=j){
            if(!Character.isLetterOrDigit(ch[i])){i++;continue;}
            if(!Character.isLetterOrDigit(ch[j])){j--;continue;}
            if(ch[i]!=ch[j])return false;
            i++;j--;
        }return true;
    }
}
