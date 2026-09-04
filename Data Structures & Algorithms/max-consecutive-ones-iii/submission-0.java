class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=0,max=0,i=0,count=0;
        for(;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                if(nums[j]==0){count--;}j++;
            }
            max=Math.max(max,i-j+1);
        }return max;
    }
}