class Solution {

    public String encode(List<String> strs) {
        String ans="";
        for(String s:strs)ans+=""+s.length()+"#"+s;
        return ans;
    }

    public List<String> decode(String str) {
        int i=0;List<String>ans=new ArrayList<>();
        for(int j=0;j<str.length();){
            int len=0;i=j;
            while(str.charAt(i)!='#'){len=str.charAt(i)-'0'+10*len;i++;}
            ans.add(str.substring(i+1,i+len+1));
            j=i+len+1;
        }return ans;

    }
}
