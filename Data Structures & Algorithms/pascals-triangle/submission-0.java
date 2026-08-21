class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>tmp=new ArrayList<>();
        tmp.add(1);
        ans.add(tmp);
        for(int i=1;i<numRows;i++){
            List<Integer>r=new ArrayList<>();
            r.add(1);
            for(int j=1;j<i;j++){
                r.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            
            r.add(1);
            ans.add(r);
        }
        return ans;
    }
}