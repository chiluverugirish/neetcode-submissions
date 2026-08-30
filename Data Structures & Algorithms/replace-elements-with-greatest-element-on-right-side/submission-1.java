class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            // while(!st.isEmpty() && st.peek()<arr[i]){
            //     st.pop();
            // }
            if(st.isEmpty()){ans[i]=-1;st.push(arr[i]);}
            else ans[i]=st.peek();
            if(!st.isEmpty()&&st.peek()<arr[i])st.push(arr[i]);
        }
        return ans;
    }
}