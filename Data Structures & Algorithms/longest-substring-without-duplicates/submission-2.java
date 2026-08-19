class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int ans=0;int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)>1){
                while(j<s.length()&&mp.get(c)>1){
                    mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                    j++;
                }
            }
            
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}
