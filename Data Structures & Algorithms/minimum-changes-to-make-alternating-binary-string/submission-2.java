class Solution {
    public int minOperations(String s) {
        int c1=0,c2=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(i%2==0){
            if(c=='1')c1++;
            else c2++;
        }
        else{
            if(c=='0')c1++;
            else c2++;
        }
       }
       return Math.min(c1,c2);
    }
}