class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        char[]ch1=s.toCharArray();
        char[]ch2=t.toCharArray();
        for(char c:ch1){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:ch2){
            if(hm.getOrDefault(c,0)<=0)hm.remove(c);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);
            }else return false;
        }

        // if(hm.size()==0)return true;
        for(char i:hm.keySet()){
            if(hm.get(i)!=0)return false;
        }
        return true;
    }
}
