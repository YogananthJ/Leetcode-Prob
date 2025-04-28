class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] connected = new boolean[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) cost[i] = Integer.MAX_VALUE;
        cost[0] = 0;

        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = 0; j < n; j++) {
                if (!connected[j] && cost[j] < minCost) {
                    minCost = cost[j];
                    minIndex = j;
                }
            }

            connected[minIndex] = true;
            totalCost += cost[minIndex];

            for (int j = 0; j < n; j++) {
                if (!connected[j]) {
                    int distance = Math.abs(points[minIndex][0] - points[j][0])
                                 + Math.abs(points[minIndex][1] - points[j][1]);
                    if (distance < cost[j]) {
                        cost[j] = distance;
                    }
                }
            }
        }

        return totalCost;
    }
}
