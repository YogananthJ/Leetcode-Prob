class Solution {
    public int[][] largestLocal(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] res = new int[n - 2][m - 2];

        for (int row = 0; row <= n - 3; row++) {
            for (int col = 0; col <= m - 3; col++) {

                int max = Integer.MIN_VALUE;

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        max = Math.max(max, grid[i][j]);
                    }
                }

                res[row][col] = max;
            }
        }
        return res;
    }
}