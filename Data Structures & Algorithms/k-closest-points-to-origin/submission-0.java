class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(a,b)->{
            int d1=a[0]*a[0]+a[1]*a[1];
            int d2=b[0]*b[0]+b[1]*b[1];
            return d1-d2;
        });
        int ans[][]=new int[k][2];
        int i=0;
        for(int ar[]:points){ans[i++]=ar;k--;if(k==0)break;}
        return ans;

    }
}
