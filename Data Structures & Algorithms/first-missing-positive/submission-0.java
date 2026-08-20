class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer>s=new HashSet<>();
       for(int i:nums){
        if(i<=0)continue;
        s.add(i);
       } 
       for(int i=1;i<Integer.MAX_VALUE;i++){
        if(!s.contains(i))return i;
       }
       return -1;
    }
}