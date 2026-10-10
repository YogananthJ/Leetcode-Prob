
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int[] diff = new int[n];
        int max = 0;
        long sum = 0;

        // Step 1: Find the absolute differences
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sum += diff[i];
            max = Math.max(max, diff[i]);
        }

        // Step 2: If all differences can become zero
        if (sum <= k) {
            return 0;
        }

        // Step 3: Binary search for the best maximum difference
        int low = 0;
        int high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long operations = 0;

            for (int d : diff) {
                if (d > mid) {
                    operations += d - mid;
                }
            }

            if (operations <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int limit = low;
        long operations = 0;

        // Step 4: Calculate operations needed to reach the limit
        for (int d : diff) {
            if (d > limit) {
                operations += d - limit;
            }
        }

        // Step 5: Calculate the squared sum
        long answer = 0;

        for (int d : diff) {
            int reduced = Math.min(d, limit);
            answer += (long) reduced * reduced;
        }

        // Step 6: Use the remaining operations
        long remaining = k - operations;

        for (int d : diff) {
            if (d >= limit && remaining > 0) {
                answer -= 2L * limit - 1;
                remaining--;
            }
        }

        return answer;
    }
}