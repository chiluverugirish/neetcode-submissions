class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0,j=1;
        for(int num:nums){
            if(num>0){arr[i]=num;i+=2;}
            else {arr[j]=num;j+=2;}
        }
        return arr;
    }
}