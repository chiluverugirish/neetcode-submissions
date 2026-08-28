class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,List<Integer>>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer>li=hm.getOrDefault(nums[i],new ArrayList<>());
            li.add(i);
            for(int j=0;j<li.size()-1;j++){
                if((li.get(j+1)-li.get(j))<=k)return true;
            }
            hm.put(nums[i],li);
        }
        // for(int j:hm.keySet()){
        //     List<Integer>li=hm.get(j);
            
        // }
        return false;
    }
}