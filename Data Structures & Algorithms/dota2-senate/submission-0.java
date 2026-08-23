class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> q1 = new LinkedList<>(); // Radiant
        Queue<Integer> q2 = new LinkedList<>(); // Dire

        int n = senate.length();

        // Store positions of R and D
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                q1.add(i);
            } else {
                q2.add(i);
            }
        }

        // Continue until one party has no senators
        while (!q1.isEmpty() && !q2.isEmpty()) {

            int r = q1.poll();
            int d = q2.poll();

            // Whoever comes first gets the chance
            if (r < d) {
                // R bans D
                // R survives and comes back in next round
                q1.add(r + n);
            } else {
                // D bans R
                // D survives and comes back in next round
                q2.add(d + n);
            }
        }

        return q1.isEmpty() ? "Dire" : "Radiant";
    }
}