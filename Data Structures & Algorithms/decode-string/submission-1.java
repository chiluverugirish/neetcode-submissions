class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder>st=new Stack<>();
        st.add(new StringBuilder());
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c-'0'<=9 &&c-'0'>=0){
                st.add(new StringBuilder());
                int j=i;
                for( j=i;j<s.length();j++){
                    c=s.charAt(j);
                    if(c-'0'<=9 &&c-'0'>=0)st.peek().append(c);
                    else break;
                }
                i=j-1;
            }
            else if(c=='['){
                st.add(new StringBuilder());
            }
            else if(c==']'){
                StringBuilder tmp=st.pop();
                
                String num=st.pop().toString();
                int n=Integer.parseInt(num);
                StringBuilder nn=new StringBuilder();
                
                for(int j=0;j<n;j++)nn.append(tmp);
                st.peek().append(nn);
            }
            else {
                st.peek().append(c);
            }
        }
        
        return st.pop().toString();
    }
}