class Solution {
    public int minSwaps(int[] nums) {
        int count=0,n=nums.length;
        for(int i:nums)if(i==1)count++;
        int min=0,c=0;
        // System.out.print(count+"#");
        for(int i=0;i<nums.length+count;i++){
            if(nums[i%n]==1)c++;
            if(i>=count){
                if(nums[i-count]==1)c--;
            }
            // System.out.println(min);
            if(i>=count-1)min=Math.max(min,c);
        }
        //  System.out.println(count+" "+min+" "+""+(count-min));
        return count-min;

    }
}
