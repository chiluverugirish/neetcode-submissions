class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0;
        int mp[]=new int[nums.length+1];
        int oc=0;
        mp[0]=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1)oc++;
            if(oc>=k)ans+=mp[oc-k];
            mp[oc]++;
            
        }
        return ans;
    }
}
