class Solution {
    static boolean isok(int[]arr,int r,int h){
        int sum=0;
        for(int i:arr){
            if(sum>h)return false;
            if(i%r==0){
                
                sum+=i/r;
            }
            else sum+=i/r+1;
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles)max=Math.max(max,i);
        int i=1,j=max;
        int ans=0;
        while(i<=j){
            int mid=(i+j)/2;
            if(isok(piles,mid,h)){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return i;
    }
}
