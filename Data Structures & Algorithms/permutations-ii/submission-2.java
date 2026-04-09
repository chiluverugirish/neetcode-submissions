class Solution {
    static List<List<Integer>> ans=new ArrayList<>();
    static List<Integer> li=new ArrayList<>();
    public static void rec(List<Integer> l,int n ){
        if(li.size()==n){
            // System.out.println(li);
            List<Integer>tmp=new ArrayList<>(li);
            if(!ans.contains(li))ans.add(tmp);
        }
        // if(l.size()==0){li.clear();return;}
        for(int i=0;i<l.size();i++){
            int num=l.get(i);
            li.add(num);
            l.remove(i);
            rec(l,n);
            l.add(i,num);
            li.remove(li.size()-1);
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans.clear();li.clear();
        if(nums.length==1){ ans.add(Arrays.asList(nums[0]));return ans;}
        List<Integer>l=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)l.add(nums[i]);
        rec(l,nums.length);
        return ans;
    }
}