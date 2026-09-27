class Solution {
    static int ispali(int i,int j,String s){
        while(i>=0 && j<s.length()){
            if(s.charAt(i)!=s.charAt(j))return j-i-1;
            i--;j++;
        }
        return j-i-1;
    }
   
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int x=ispali(i,i,s);
            int y=0;
            
            if(i+1<s.length())y=ispali(i,i+1,s);
            c+=x/2+1+y/2;
        }
        return c;
    }
}
