class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int init=0,ans=0,n=customers.length;
        for(int i=0;i<n;i++)if(grumpy[i]==0)init+=customers[i];
        for(int i=0;i<minutes;i++)if(grumpy[i]==1)init+=customers[i];
        ans=init;
        for(int i=minutes;i<n;i++){
            
            
            if(grumpy[i-minutes]==1){
                
                init-=customers[i-minutes];
            }
           if(grumpy[i]==1)init+=customers[i];
           ans=Math.max(ans,init);
        }
        return ans;
    }
}