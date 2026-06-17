class Solution {
    public boolean isValid(String st) {
        Stack<Character>s=new Stack<>();
        for(char c:st.toCharArray()){
            if(c=='['||c=='{'||c=='(')s.push(c);
            else{
                if(s.size()==0)return false;
                char p=s.pop();
                if(c==']'&&p!='[')return false;
                if(c=='}'&&p!='{')return false;
                if(c==')'&&p!='(')return false;
            }
        }if(s.size()==0)return true;
        return false;
    }
}
