class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int oc=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==1)oc++;
                if(oc==k)ans++;
            }
        }
        // int mp[]=new int[nums.length];
        // int oc=0;
        // for(int i=0;i<nums.length;i++){
            
        //     if(nums[i]%2==1)oc++;
        //     else oc=0;
        //     mp[i]=oc;
        //     if(oc-mp[i])ans+=
        // }
        return ans;
    }
}
