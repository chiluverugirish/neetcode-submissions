class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>ans=new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int arr[]=intervals[i];
            if(ans.get(ans.size()-1)[1]<arr[0])ans.add(arr);
            else ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],arr[1]);
        }
        int arr[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)arr[i]=ans.get(i);
        return arr;
    }
}
