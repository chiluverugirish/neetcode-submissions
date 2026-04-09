class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String s:strs){
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String ns=new String(ch);
            List<String>ls=hm.getOrDefault(ns,new ArrayList<>());
            ls.add(s);
            hm.put(ns,ls);
        }
        for(String s:hm.keySet())ans.add(hm.get(s));
        return ans;
    }
}
