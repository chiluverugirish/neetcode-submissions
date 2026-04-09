class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:nums)mp.put(i,mp.getOrDefault(i,0)+1);
        int arr[][]=new int[mp.size()][2];
        int m=0;
        for(int i:mp.keySet()){arr[m++]=new int[]{i,mp.get(i)};}
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        List<Integer>l=new ArrayList<>();
        for(m=0;m<arr.length&&k>0;m++,k--)l.add(arr[m][0]);
        int ans[]=new int[l.size()];m=0;
        for(int i:l)ans[m++]=i;
       return ans;
    }
}
