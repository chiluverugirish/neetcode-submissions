class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char c:chars.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int sum=0;
        for(String s:words){
            Map<Character,Integer>mp1=new HashMap<>();
            for(char c:s.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }boolean ok=true;
        for(char c:mp1.keySet()){
            int n1=mp.getOrDefault(c,0),n2=mp1.get(c);
            if(n1<n2){ok=false;break;}
        }
        if(ok){sum+=s.length();}
        }
        return sum;
    }
}