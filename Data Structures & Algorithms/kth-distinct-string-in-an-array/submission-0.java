class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>hs=new HashMap<>();
        for(String s:arr){
            hs.put(s,hs.getOrDefault(s,0)+1);
        }
        int c=0;
        for(String s:arr){
            int val=hs.get(s);
            if(val==1){
                c++;
                if(c==k)return s;
            }
        }
        return "";
    }
}