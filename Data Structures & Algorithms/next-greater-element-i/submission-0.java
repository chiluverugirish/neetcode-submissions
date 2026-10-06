class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[]=new int[nums2.length];
        Stack<Integer>st=new Stack<>();
        // int j
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
           while(!st.isEmpty() && st.peek()<nums2[i])st.pop();
           if(!st.isEmpty())nge[i]=st.peek();
           else nge[i]=-1;
           st.push(nums2[i]);
           hm.put(nums2[i],i);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nge[hm.get(nums1[i])];
        }return ans;
        
    }
}