class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer>hm=new HashSet<>();
        for(int i=1;i<=nums.length;i++)hm.add(i);
        for(int i:nums)hm.remove(i);
        List<Integer>ans=new ArrayList<>(hm);
        return ans;
    }
}