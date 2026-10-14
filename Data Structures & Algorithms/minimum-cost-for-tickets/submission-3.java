
class Solution {
    static int minCost(int[] cost, int[] days, int i,
                       int next, int[][] dp) {

        if (i == days.length) return 0;

        if (days[i] < next) {
            return minCost(cost, days, i + 1, next, dp);
        }

        if (dp[i][next] != -1) {
            return dp[i][next];
        }

        int one = cost[0] +
                  minCost(cost, days, i + 1, days[i] + 1, dp);

        int seven = cost[1] +
                    minCost(cost, days, i + 1, days[i] + 7, dp);

        int thirty = cost[2] +
                     minCost(cost, days, i + 1, days[i] + 30, dp);

        return dp[i][next] =
               Math.min(one, Math.min(seven, thirty));
    }

    public int mincostTickets(int[] days, int[] costs) {
        int[][] dp = new int[days.length][366];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return minCost(costs, days, 0, 0, dp);
    }
}
