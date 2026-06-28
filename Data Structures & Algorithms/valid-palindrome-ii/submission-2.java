class Solution {
    boolean ispal(char ch[],int i,int j){
        while(i<j){
            if(ch[i]!=ch[j])return false;
            i++;j--;
        }return true;
    }
    public boolean validPalindrome(String s) {
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1,c=0;
        while(i<=j){
            if(ch[i]!=ch[j]){
                return(ispal(ch,i,j-1)||ispal(ch,i+1,j));
            }
            
            i++;j--;
        }return true;
    }
}