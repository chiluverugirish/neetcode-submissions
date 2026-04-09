class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int max=0;
        char[]ch=s.toCharArray();
        int j=0;
        for(int i=0;i<ch.length;i++){
            mp.put(ch[i],mp.getOrDefault(ch[i],0)+1);
            while(mp.get(ch[i])>1){
                mp.put(ch[j],mp.get(ch[j])-1);
                if(mp.get(ch[j])==0)mp.remove(ch[j]);
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}
