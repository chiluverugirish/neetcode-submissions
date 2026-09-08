class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int arr[]=new int[nums.length];
        int a=0,b=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[a++]=nums[i];
            }else arr[b--]=nums[i];
        }return arr;
    }
}