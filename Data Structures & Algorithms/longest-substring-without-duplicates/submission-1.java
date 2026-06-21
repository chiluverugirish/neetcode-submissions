class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hs=new HashSet<>();
        char ch[]=s.toCharArray();
        int i=0,max=0;
        for(int j=0;j<ch.length;j++){
                while(i<ch.length&&hs.contains(ch[j])){
                    hs.remove(ch[i]);
                    i++;
                }
            hs.add(ch[j]);
            max=Math.max(max,hs.size());
        }return max;
    }
}
