class Solution {

    public String longestCommonPrefix(String[] strs) {
        String small=strs[0];
        for(String s:strs){
            if(s.length()<small.length()){
                small=s;
            }
        }
        // String ans=small;
        int len=small.length();
        for(String s:strs){
            int i=0,j=small.length()-1;
            while(i<=j){
                int mid=(i+j)/2;
                if(small.substring(0,mid+1).equals(s.substring(0,mid+1)))i=mid+1;
                else j=mid-1;
            }
            len=Math.min(len,j+1);
        }
        
        return small.substring(0,len);
    }
}