class Solution {
    int solve(int[] days, int[] costs, int i, int[] dp) {
        if (i >= days.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // 1-day ticket
        int cost1 = costs[0] + solve(days, costs, i + 1, dp);

        // 7-day ticket
        int j = i;
        while (j < days.length && days[j] < days[i] + 7) {
            j++;
        }
        int cost7 = costs[1] + solve(days, costs, j, dp);

        // 30-day ticket
        j = i;
        while (j < days.length && days[j] < days[i] + 30) {
            j++;
        }
        int cost30 = costs[2] + solve(days, costs, j, dp);

        return dp[i] = Math.min(cost1, Math.min(cost7, cost30));
    }

    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp, -1);

        return solve(days, costs, 0, dp);
    }
}
