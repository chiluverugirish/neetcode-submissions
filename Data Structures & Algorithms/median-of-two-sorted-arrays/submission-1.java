class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j]){
                arr[k++]=nums2[j++];
            }else arr[k++]=nums1[i++];
        }
        while(i<nums1.length)arr[k++]=nums1[i++];
        while(j<nums2.length)arr[k++]=nums2[j++];
        
        int x=(nums1.length+nums2.length)/2;
        if((nums1.length+nums2.length)%2==0)return (double)((double)arr[x-1]+arr[x])/2;
        return arr[x];
    }
}
