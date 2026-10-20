class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)pq.add(i);
        while(!pq.isEmpty() && pq.size()!=1){
            int x=pq.poll();
            // if(pq.isEmpty())break;
            int y=pq.poll();
            if(x==y)continue;
            if(x>y)pq.add(x-y);
            else pq.add(y-x);
            
        }
        if(pq.isEmpty())return 0;
        return pq.poll();
    }
}
