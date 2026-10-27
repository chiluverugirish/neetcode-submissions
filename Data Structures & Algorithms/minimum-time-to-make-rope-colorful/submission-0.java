class Solution {
    public int minCost(String colors, int[] neededTime) {
        char ch[]=colors.toCharArray();
        int ans=0;
        for(int i=0;i<ch.length-1;){
            if(ch[i]==ch[i+1]){
                int sum=neededTime[i],min=neededTime[i];
                while(i<ch.length-1 && ch[i]==ch[i+1]){
                    min=Math.max(min,neededTime[i+1]);
                    sum+=neededTime[i+1];
                    i++;
                }
                
                
                ans+=(sum-min);
            }   
            else i++;
        }
        return ans;
    }
}
