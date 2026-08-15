from functools import cache
class Solution:
    
    def coinChange(self, coins: List[int], amount: int) -> int:
        mx = 10000000007
        coins = sorted(coins)[::-1]
        @cache
        def get(i, left):
            if left == 0:
                return 0
            if i == len(coins):
                return mx
            if coins[i] > left:
                return get(i + 1, left)
            return min(get(i + 1, left), get(i, left - coins[i]) + 1)
        x = get(0, amount) 
        return x if x < mx else -1

            

        