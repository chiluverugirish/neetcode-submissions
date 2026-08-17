class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        if(nums.length==0)return ans;
        if(nums.length==1){
            if(nums[0]==target){
                ans[0]=0;ans[1]=0;
            }
            return ans;
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]>target)j=mid-1;
            else if(nums[mid]<target)i=mid+1;
            else{
                
                int a=mid,b=mid;
                boolean a1=false,b1=false;
                while(a>=0 &&nums[a]==nums[mid]){a1=true;a--;}
                while(b<nums.length &&nums[b]==nums[mid]){b1=true;b++;}
                if(a1)a++;
                if(b1)b--;
                ans[0]=a;
                ans[1]=b;
                return ans;
            }
        }
        
        return ans;
    }
}