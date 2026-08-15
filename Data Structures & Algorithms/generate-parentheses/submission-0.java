class Solution {
    static List<String>ans;
    static void rec(int o,int c,int n,char ch[],int i){
        if(o<0||c<0||o>n||c>n)return;
        if(n==c && n==o){
            ans.add(new String(ch));return;
        }
        ch[i]='(';
        rec(o+1,c,n,ch,i+1);
        if(o>c){
            ch[i]=')';
            rec(o,c+1,n,ch,i+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        char ch[]=new char[2*n];
        rec(0,0,n,ch,0);
        return ans;
    }
}
