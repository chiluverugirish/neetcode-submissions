class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        for(int j=numbers.length-1;j>=0;){
            int v=numbers[i]+numbers[j];
            if(v==target)return new int [] {i+1,j+1};
            else if(v>target)j--;
            else i++;
        }
        return new int [] {};
    }
}
