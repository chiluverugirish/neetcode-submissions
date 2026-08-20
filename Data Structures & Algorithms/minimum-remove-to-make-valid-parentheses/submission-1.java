class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='(' && c!=')'){sb.append(c+"");continue;}
            if(c=='('){
                st.push(c);
                sb.append(c+"");
            }
            else{
                if(st.size()==0){
                    // System.out.println(c);
                    continue;}
                char t=st.pop();
                if(t!='('){
                    // System.out.println(c);
                    continue;}
                sb.append(c+"");
            }
        }
        
        if(st.size()>0){
            while(st.size()>0){
                char c=st.pop();
                int i=sb.length()-1;
                while(i>=0&&sb.charAt(i)!=c)i--;
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}