class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(b[1]==a[1])return a[0]-b[0];
            return b[1]-a[1];
        });
        for(int i:hm.keySet()){
            int arr[]=new int[]{i,hm.get(i)};
            pq.add(arr);
        }
        int ans[]=new int[k];int i=0;
        while(i!=k&&!pq.isEmpty()){
            ans[i++]=pq.poll()[0];
        }return ans;
    }
}
