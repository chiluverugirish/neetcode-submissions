class Solution {
    public static boolean isAlnum(char c){
        return (((int)'A') <= ((int)c)&&((int)c) <= ((int)'Z'))||(((int)'a')<=((int)c)&&((int)c)<=((int)'z'))||((int)'0'<=(int)c&&((int)c)<=(int)'9');   
}
    public boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        if(s.length()==0)return true;
        while(start<end){

            while(!isAlnum(s.charAt(start))&&start<end)start++;
            while(!isAlnum(s.charAt(end))&&start<end)end--;
            if(Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))){
                start++;end--;
            }
            else return false;
        }
        return true;
    }
}
