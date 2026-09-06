class Solution {
    static int sum=0;
    static void rec(int i,int[]nums,int xor){
        if(i==nums.length){
            sum+=xor;
            return;
        }
        rec(i+1,nums,xor^nums[i]);
        rec(i+1,nums,xor);
    }
    public int subsetXORSum(int[] nums) {
        sum=0;
        rec(0,nums,0);
        return sum;
    }
}