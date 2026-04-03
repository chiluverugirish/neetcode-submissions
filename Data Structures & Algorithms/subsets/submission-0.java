class Solution {
    int []nums;
    List<List<Integer>>ans;
    void rec(int i,List<Integer>l){
        if(i==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        rec(i+1,l);
        l.remove(Integer.valueOf(nums[i]));
        rec(i+1,l);
    }
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        ans=new ArrayList<>();
        rec(0,new ArrayList<>());
        return ans;
    }
}
