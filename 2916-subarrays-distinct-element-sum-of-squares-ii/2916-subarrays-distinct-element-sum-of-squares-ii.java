class Solution {
    private static final int MOD = 1_000_000_007;

    private long[] sum;
    private long[] square;
    private long[] lazy;
    private int n;

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        square = new long[4 * n];
        lazy = new long[4 * n];

        int[] lastSeen = new int[100001];

        // 0 means not seen yet; store index + 1.
        long answer = 0;

        for (int i = 0; i < n; i++) {
            int value = nums[i];

            int previous = lastSeen[value] - 1;

            // Increase distinct counts for starting positions
            // from previous + 1 through i.
            update(1, 0, n - 1, previous + 1, i);

            // Sum of squared distinct counts for subarrays
            // ending at index i.
            answer = (answer + square[1]) % MOD;

            lastSeen[value] = i + 1;
        }

        return (int) answer;
    }

    private void update(int node, int left, int right,
                        int ql, int qr) {
        if (ql > right || qr < left) {
            return;
        }

        if (ql <= left && right <= qr) {
            apply(node, left, right);
            return;
        }

        pushDown(node, left, right);

        int mid = left + (right - left) / 2;

        update(node * 2, left, mid, ql, qr);
        update(node * 2 + 1, mid + 1, right, ql, qr);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;

        square[node] =
            (square[node * 2] + square[node * 2 + 1]) % MOD;
    }

    private void apply(int node, int left, int right) {
        long length = right - left + 1L;
        long oldSum = sum[node];

        square[node] =
            (square[node] + 2L * oldSum + length) % MOD;

        sum[node] = (oldSum + length) % MOD;

        lazy[node]++;
    }

    private void pushDown(int node, int left, int right) {
        if (lazy[node] == 0 || left == right) {
            return;
        }

        int mid = left + (right - left) / 2;

        applyMultiple(node * 2, left, mid, lazy[node]);
        applyMultiple(node * 2 + 1, mid + 1, right, lazy[node]);

        lazy[node] = 0;
    }

    private void applyMultiple(int node, int left, int right,
                               long times) {
        long length = right - left + 1L;
        long oldSum = sum[node];

        // (x + times)^2 = x^2 + 2 * times * x + times^2
        square[node] = (
            square[node]
            + 2L * times % MOD * oldSum % MOD
            + times * times % MOD * length % MOD
        ) % MOD;

        sum[node] = (oldSum + times * length) % MOD;

        lazy[node] += times;
    }
}