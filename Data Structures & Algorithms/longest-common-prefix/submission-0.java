class Solution {
    boolean issubstring(String[] strs,int mid,String cpr){
        for(String s:strs){
            if(!s.substring(0,mid+1).equals(cpr))return false;
        }return true;
    }
    public String longestCommonPrefix(String[] strs) {
        String small=strs[0];
        for(String s:strs){
            if(s.length()<small.length())small=s;
        }
        int i=0,j=small.length()-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(issubstring(strs,mid,small.substring(0,mid+1))){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return small.substring(0,j+1);

    }
}