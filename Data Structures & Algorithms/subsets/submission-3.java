class Solution {
    List<List<Integer>>hs=new ArrayList<>();
    void rec(int[]nums,int i,List<Integer>l){
        if(i==nums.length){
            hs.add(new ArrayList<>(l));
            return;
        }
        rec(nums,i+1,l);
        l.add(nums[i]);
        rec(nums,i+1,l);
        l.removeLast();
    }
    public List<List<Integer>> subsets(int[] nums) {
        rec(nums,0,new ArrayList<>());
        List<List<Integer>>ans=new LinkedList<>();
        // for(List<Integer> li:hs){
        //     ans.add(li);
        // }return ans;
        return hs;
    }
}
