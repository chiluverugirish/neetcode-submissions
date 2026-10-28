class KthLargest {

    int k;
    PriorityQueue<Integer>pq;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)pq.add(i);
        this.k=k;
    }
    
    public int add(int val) {
        pq.add(val);
        int tmp=k;
        List<Integer>l=new ArrayList<>();
        while(tmp!=1){l.add(pq.poll());tmp--;}
        int r=pq.peek();
        for(int i:l)pq.add(i);
        return r;
    }
}
