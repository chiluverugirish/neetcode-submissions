class Solution {
    public int longestPalindrome(String s) {
        int ans=0;boolean isodd=false;
        Map<Character,Integer>mp=new HashMap<>();
        for(char c:s.toCharArray())mp.put(c,mp.getOrDefault(c,0)+1);
        for(int c:mp.values()){
            ans+=c/2;
            if(c%2==1)isodd=true;
        }
        ans*=2;
        if(isodd)return ans+1;
        return ans;
    }
}