class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        // prefix[i] = number of descents before index i
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            prefix[i + 1] = prefix[i]
                    + (nums[i] > nums[i + 1] ? 1 : 0);
        }
        prefix[n] = prefix[n - 1];

        // Precompute logarithms
        int[] log = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int levels = log[n] + 1;
        int[][] minTable = new int[levels][n];
        int[][] maxTable = new int[levels][n];

        for (int i = 0; i < n; i++) {
            minTable[0][i] = nums[i];
            maxTable[0][i] = nums[i];
        }

        // Build sparse tables for range minimum and maximum
        for (int p = 1; p < levels; p++) {
            int len = 1 << p;
            int half = len >> 1;

            for (int i = 0; i + len <= n; i++) {
                minTable[p][i] = Math.min(
                    minTable[p - 1][i],
                    minTable[p - 1][i + half]
                );

                maxTable[p][i] = Math.max(
                    maxTable[p - 1][i],
                    maxTable[p - 1][i + half]
                );
            }
        }

        // Try each divisor of n
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean valid = true;
            int previousMax = Integer.MIN_VALUE;

            for (int start = 0; start < n; start += k) {
                int end = start + k - 1;

                // Count descents inside this block
                int descents = prefix[end] - prefix[start];

                // Include the circular connection
                if (nums[end] > nums[start]) {
                    descents++;
                }

                if (descents > 1) {
                    valid = false;
                    break;
                }

                // Find the block's minimum and maximum
                int p = log[k];
                int len = 1 << p;

                int min = Math.min(
                    minTable[p][start],
                    minTable[p][end - len + 1]
                );

                int max = Math.max(
                    maxTable[p][start],
                    maxTable[p][end - len + 1]
                );

                // Blocks must connect in sorted order
                if (previousMax > min) {
                    valid = false;
                    break;
                }

                previousMax = max;
            }

            if (valid) {
                ans += k;
            }
        }

        return ans;
    }
}