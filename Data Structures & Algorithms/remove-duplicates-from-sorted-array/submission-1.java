class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)return 1;
        int i=0,j=1;boolean ch=false;
        while(j<nums.length){
            boolean c=false;
            while(j<nums.length && nums[i]==nums[j]){ch=true;c=true;j++;}
            if(c &&j<nums.length){nums[i+1]=nums[j];j--;}
            i++;j++;
        }
        if(!ch)return i+1;
        return i;
    }
}