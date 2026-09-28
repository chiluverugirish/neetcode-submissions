class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'0']++;
        }
        int len=0;
        boolean is=false;
        for(int i=0;i<256;i++){
            if(arr[i]%2!=0)is=true;
            len+=(arr[i]/2)*2;
        }
        if(is)return len+1;
        return len;
    }
}