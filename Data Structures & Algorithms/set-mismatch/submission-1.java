class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean ar[]=new boolean[nums.length+1];
        int mis=-1;
        for( int i=0;i<nums.length;i++){if(ar[nums[i]])mis=nums[i];ar[nums[i]]=true;}
        for(int i=1;i<nums.length+1;i++)if(!ar[i]){
            return new int[]{mis,i};
        }
        return new int[2];
    }
}