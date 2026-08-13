class Solution {
    public boolean wordPattern(String pattern, String s) {
        String si[]=s.split(" ");
        if(si.length!=pattern.length())return false;
        HashMap<Character,String>hm=new HashMap<>();
        HashMap<String,Character>hm2=new HashMap<>();
        int i=0;
        
        for(char c:pattern.toCharArray()){
            
            if(!hm.containsKey(c) && !hm2.containsKey(si[i])){
                hm.put(c,si[i]);
                hm2.put(si[i],c);
            }
            else if(hm.containsKey(c)){
                // System.out.println(c+" "+hm.get(c)+" "+si[i]+" 1");
                if(!hm.get(c).equals(si[i]))return false;
            }
            else if(hm2.containsKey(si[i])){
                // System.out.println(c+" "+hm2.get(si[i])+" "+si[i]+" 2");
                if(hm2.get(si[i])!=c)return false;
            }i++;
        }return true;
    }
}