class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int n=nums.length;
        List<Integer>ans=new ArrayList<>();
        for(int i:mp.keySet()){
            int v=mp.get(i);
            if(v>n/3)ans.add(i);
        }
        return ans;
    }
}