class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[]=new int[nums2.length];
        Stack<Integer>st=new Stack<>();
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            // System.out.print(st);
            while(!st.isEmpty() && st.peek()<=nums2[i])st.pop();
            // System.out.println(st);
            if(st.isEmpty())nge[i]=-1;
            else nge[i]=st.peek();
            st.push(nums2[i]);
            mp.put(nums2[i],nge[i]);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)ans[i]=mp.get(nums1[i]);
        return ans;
    }
}