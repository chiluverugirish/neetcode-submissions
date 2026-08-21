class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap<Character,Integer>mp=new HashMap<>();
       for(char c:s1.toCharArray()){
        mp.put(c,mp.getOrDefault(c,0)+1);
       }
       for(int i=0;i<s2.length();){
        if(mp.containsKey(s2.charAt(i))){
            int j=i;
            if(j+s1.length()>s2.length())return false;
            HashMap<Character,Integer>cp=new HashMap<>(mp);
            while(j<s2.length()&&cp.containsKey(s2.charAt(j))){
                char ch=s2.charAt(j);
                cp.put(ch,cp.get(ch)-1);
                if(cp.get(ch)==0)cp.remove(ch);
                j++;
                }
            if(cp.size()==0)return true;
            // i=j;
        }
        i++;
       }
       return false;
    }
}
