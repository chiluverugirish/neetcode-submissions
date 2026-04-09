class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0,j=0;
        char ch1[]=word.toCharArray(),ch2[]=abbr.toCharArray();
        while(i<ch1.length&&j<ch2.length){
            int num=-1;
            if(Character.isDigit(ch2[j])){
                if(ch2[j] == '0') return false;
                num=0;
                while(j<ch2.length && Character.isDigit(ch2[j])){
                    num=num*10+(ch2[j]-'0');
                    j++;
                }
                i+=num;
            }else{
                if(ch1[i]!=ch2[j])return false;
                i++;j++;
            }
        }return i == ch1.length && j == ch2.length;
    }
}