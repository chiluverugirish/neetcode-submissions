class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        
        for(int i=0;i<nums.length;){
            if(nums[i]==1){
                int c=i;
                while(i<nums.length && nums[i]==1)i++;
                max=Math.max(max,i-c);
            }
            else i++;
        }
        return max;
    }
}