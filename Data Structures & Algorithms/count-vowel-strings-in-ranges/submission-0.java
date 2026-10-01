class Solution {
    static boolean isok(String st){
        char f=st.charAt(0),l=st.charAt(st.length()-1);
        Set<Character>s=new HashSet<>();
        s.add('a');s.add('e');s.add('i');s.add('o');s.add('u');
        // System.out.println(f+" "+l+" "+s.contains(f) +" "+ s.contains(l));
        return s.contains(f) && s.contains(l);
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[]prefix=new int[n];
        for(int i=0;i<words.length;i++){
            if(isok(words[i])){
                if(i==0)prefix[i]=1;
                else prefix[i]=prefix[i]=prefix[i-1]+1;
            }
            else if(i>0)prefix[i]=prefix[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int[]tmp=queries[i];
            int s=tmp[0],e=tmp[1];
            if(s==0)ans[i]=prefix[e];
            else ans[i]=prefix[e]-prefix[s-1];
        }return ans;
    }
}