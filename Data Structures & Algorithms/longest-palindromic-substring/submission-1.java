class Solution {
    // static String oddpali(String s,int i){
    //     int a=i,b=i;
    //     while(a>=0&&b<s.length() && s.charAt(a)==s.charAt(b)){
    //         a--;b++;
    //     }
    //     return s.substring(a+1,b);
    // } 
    // static String evenpali(String s,int i,int j){
    //     int a=i,b=j;
    //     while(a>=0&&b<s.length() && s.charAt(a)==s.charAt(b)){
    //         a--;b++;
    //     }
    //     return s.substring(a+1,b);
    // }
    static boolean ispali(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String max="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(max.length()<j-i+1&&ispali(i,j,s)){
                    
                        max=s.substring(i,j+1);
                    
                }
            }
        }
        return max;
    }
}
