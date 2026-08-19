class Solution {
    public boolean makeEqual(String[] words) {
        int mp[]=new int[26];
        for(String s:words){
            for(char c:s.toCharArray())mp[c-'a']++;
        }
        int len=words.length;
        
        for(int i=0;i<26;i++)if(mp[i]%len!=0)return false;
        return true;
    }
}