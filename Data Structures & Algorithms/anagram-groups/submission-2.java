class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();Arrays.sort(ch);
            String n=new String(ch);
            List<String>tmp=hm.getOrDefault(n,new ArrayList<>());
            tmp.add(s);
            hm.put(n,tmp);
        }
        List<List<String>>ans=new ArrayList<>();
        for(String s:hm.keySet()){
            ans.add(hm.get(s));
        }return ans;
    }
}
