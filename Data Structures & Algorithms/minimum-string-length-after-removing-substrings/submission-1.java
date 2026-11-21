class Solution {
    public int minLength(String s) {
         Stack<Character>st=new Stack();
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty()){
                if(c=='B' && st.peek()=='A')st.pop();
                else if(c=='D' && st.peek()=='C')st.pop();
                else st.push(c);
            }
            else st.push(c);
         }
         return st.size();
    }
}
