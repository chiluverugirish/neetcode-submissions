class Solution {
    static List<List<Integer>>l=new ArrayList<>();
    static void rec(int[] nums,boolean used[],List<Integer>ans){
        if(ans.size()==nums.length){
            l.add(new ArrayList<>(ans));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            used[i]=true;
            ans.add(nums[i]);
            rec(nums,used,ans);
            ans.removeLast();
            used[i]=false;
        }
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        l.clear();
        rec(nums,new boolean[nums.length],new ArrayList<>());    
        return l;
    }
}