class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;){
            nums[j]=nums[i];
            if(i<nums.length-1&&nums[i]==nums[i+1]){
                int val=nums[i];
                while(i<nums.length&&val==nums[i])i++;
                i--;
            }
            
            i++;j++;
        }
        return j;
    }
}