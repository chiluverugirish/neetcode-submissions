class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean tmp=false;
        if(nums[0]%2==0)tmp=true;
        for(int i=1;i<nums.length;i++){
            if(tmp){
                if(nums[i]%2!=1)return false;tmp=false;
            }
            else{
                if(nums[i]%2==1)return false;tmp=true;
            }
        }return true;
    }
}