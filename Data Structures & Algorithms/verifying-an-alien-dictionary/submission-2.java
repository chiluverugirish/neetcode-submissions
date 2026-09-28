class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int mp[]=new int[order.length()];
        for(int i=0;i<mp.length;i++){
            mp[order.charAt(i)-'a']=i;
        }
        String tmp[]=Arrays.copyOf(words,words.length);
        Arrays.sort(tmp,(a,b)->{
            int min=Math.min(a.length(),b.length());
            for(int i=0;i<min;i++){
                char x=a.charAt(i),y=b.charAt(i);
                if(mp[x-'a']!=mp[y-'a'])return mp[x-'a']-mp[y-'a'];
            }
            return a.length()-b.length();
        });
        return Arrays.equals(words,tmp);
    }
}