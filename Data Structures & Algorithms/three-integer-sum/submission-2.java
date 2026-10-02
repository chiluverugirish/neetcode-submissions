class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int target=-nums[i];
            Set<Integer>hs=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                if(hs.contains(target-nums[j])){
                    List<Integer>tmp=new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(target-nums[j]);
                    s.add(tmp);
                }
                hs.add(nums[j]);
            }
        }
        return new ArrayList<>(s);
    }
}
