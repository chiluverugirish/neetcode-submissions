class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean>hm=new HashMap<>();
        int max=0;
        for(int i:nums){
            if(hm.containsKey(i-1))hm.put(i,true);
            else hm.put(i,false);
        }
        
        for(int i:hm.keySet()){
            if(!hm.containsKey(i-1)){
                int val=i,c=0;
                while(hm.containsKey(val++))c++;
                max=Math.max(max,c);
            }
        }
        
        return max;
        
    }
}
