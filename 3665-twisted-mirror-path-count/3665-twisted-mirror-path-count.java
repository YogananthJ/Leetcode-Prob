
class Solution {
    static final int MOD = 1_000_000_007;

    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // right[i][j]: Final empty cell when entering (i,j) from left
        // down[i][j]: Final empty cell when entering (i,j) from above
        int[][] right = new int[m][n];
        int[][] down = new int[m][n];

        // -1 means invalid (out of bounds)
        for (int i = 0; i < m; i++) {
            java.util.Arrays.fill(right[i], -1);
            java.util.Arrays.fill(down[i], -1);
        }

        // Precompute mirror chains in reverse order
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (grid[i][j] == 0) {
                    right[i][j] = i * n + j;
                    down[i][j] = i * n + j;
                } else {
                    // Enter mirror moving right -> turn down
                    if (i + 1 < m) {
                        right[i][j] = down[i + 1][j];
                    }

                    // Enter mirror moving down -> turn right
                    if (j + 1 < n) {
                        down[i][j] = right[i][j + 1];
                    }
                }
            }
        }

        // DP on empty cells
        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1 || dp[i][j] == 0) {
                    continue;
                }

                long ways = dp[i][j];

                // Try moving right
                if (j + 1 < n) {
                    int pos = right[i][j + 1];

                    if (pos != -1) {
                        int x = pos / n;
                        int y = pos % n;

                        dp[x][y] = (dp[x][y] + ways) % MOD;
                    }
                }

                // Try moving down
                if (i + 1 < m) {
                    int pos = down[i + 1][j];

                    if (pos != -1) {
                        int x = pos / n;
                        int y = pos % n;

                        dp[x][y] = (dp[x][y] + ways) % MOD;
                    }
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }
}
