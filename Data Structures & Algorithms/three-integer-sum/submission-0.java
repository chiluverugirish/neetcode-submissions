class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
    // List<List<Integer>>ans=new ArrayList<>();
    HashSet<List<Integer>>ans=new HashSet<>();
    for(int i=0;i<nums.length-2;i++){
        int s=i+1,e=nums.length-1,target=-1*nums[i];
        while(s<e){
            int val=nums[s]+nums[e];
            if(val==target){
                List<Integer>l=new ArrayList<>();l.add(nums[i]);l.add(nums[s]);l.add(nums[e]);
                ans.add(l);
                // break;
                s++;e--;
            }
            else if(val>target)e--;
            else s++;
        }
    }
    List<List<Integer>>ans1=new ArrayList<>();
    for(List<Integer>l:ans)ans1.add(l);
    return ans1;

    }
}