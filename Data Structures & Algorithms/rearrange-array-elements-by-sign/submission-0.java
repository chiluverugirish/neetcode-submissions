class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        for(int i:nums)if(i>0)pos.add(i);else neg.add(i);
        int i=0;
        for(int j=0;j<nums.length;)
        {nums[j++]=pos.get(i);nums[j++]=neg.get(i++);}
            
        return nums;
    }
}