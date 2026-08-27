class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int i:hm.keySet()){
            int val=hm.get(i);
            if(val<=1)return -1;
            ans+=(val+2)/3;
        }
        return ans;
    }
}