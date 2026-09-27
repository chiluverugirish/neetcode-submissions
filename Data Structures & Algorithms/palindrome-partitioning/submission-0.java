class Solution {
    static boolean ispali(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
    static List<List<String>>ans;
    static void rec(String s,int i,List<String>li){
        if(i==s.length()){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(ispali(i,j,s)){
                li.add(s.substring(i,j+1));
                rec(s,j+1,li);
                li.remove(li.size()-1);
                }
        }
    }
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        rec(s,0,new ArrayList<>());
        return ans;
    }
}
