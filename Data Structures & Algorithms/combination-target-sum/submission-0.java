class Solution {
    static List<List<Integer>>ans;
    static void rec(int[]nums,int tar,int sum,List<Integer>li,int i){
        if(sum>tar||i>=nums.length)return;
        if(sum==tar){
            ans.add(new ArrayList<>(li));
            return;
        }
        
        li.add(nums[i]);
        rec(nums,tar,sum+nums[i],li,i);
        li.remove(li.size()-1);
        rec(nums,tar,sum,li,i+1);
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans=new ArrayList<>();
        rec(nums,target,0,new ArrayList<>(),0);
        return ans;
    }
}
