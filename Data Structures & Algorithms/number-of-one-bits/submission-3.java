class Solution {
    public int hammingWeight(int n) {
        int s=0;
        while(n>0){
            if((n&1)==1)s++;
            n=n>>1;
        }return s;
    }
}
