class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(min>=prices[i]){
                 min2=min;
                min=prices[i];
               
            }
            if(min<prices[i] && min2>prices[i])min2=prices[i];
            //  System.out.println(min+" "+min2);
        }
        // System.out.print(min+" "+min2);
        if(min==Integer.MAX_VALUE || min2==Integer.MAX_VALUE)return money;
        int sum=min+min2;
        if(sum>money)return money;
        return money-sum;
    }
}