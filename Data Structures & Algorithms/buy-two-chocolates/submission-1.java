class Solution {
    public int buyChoco(int[] prices, int money) {
        // int s=Integer.MAX_VALUE
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        if(money>=sum)return money-sum;
        return money;
    }
}