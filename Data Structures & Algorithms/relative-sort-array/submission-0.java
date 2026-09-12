class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer>hs=new TreeMap<>();
        for(int i:arr1){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }int k=0;
        for(int i=0;i<arr2.length;i++){
            int val=arr2[i];
            int count=hs.getOrDefault(val,0);
            for(int c=0;c<count;c++)arr1[k++]=val;
            hs.remove(val);
        }
        for(int i:hs.keySet()){
            int val=i;
            int count=hs.getOrDefault(i,0);
            for(int c=0;c<count;c++)arr1[k++]=i;
        }
        return arr1;
    }
}