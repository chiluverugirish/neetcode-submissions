class Solution {
    static String oddpali(String s,int i){
        int a=i,b=i;
        while(a>=0&&b<s.length() && s.charAt(a)==s.charAt(b)){
            a--;b++;
        }
        return s.substring(a+1,b);
    } 
    static String evenpali(String s,int i,int j){
        int a=i,b=j;
        while(a>=0&&b<s.length() && s.charAt(a)==s.charAt(b)){
            a--;b++;
        }
        return s.substring(a+1,b);
    }
    public String longestPalindrome(String s) {
        String max="";
        for(int i=0;i<s.length();i++){
            String x=oddpali(s,i);
            String y="";
            if(i+1<s.length()){
                y=evenpali(s,i,i+1);
            }
            if(x.length()>y.length() && x.length()>max.length())max=x;
            else if(x.length()<y.length() && y.length()>max.length())max=y;
        }
        return max;
    }
}
