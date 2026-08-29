class Solution {
    
    public int specialArray(int[] nums) {
        
        int i=0,j=nums.length;
        while(i<=j){
            int mid=(i+j)/2;
            int count=0;
            for(int k:nums)if(k>=mid)count++;
            if(count==mid)return mid;
            else if(count<mid)j=mid-1;
            else i=mid+1;
        }
        return -1;
    }
}