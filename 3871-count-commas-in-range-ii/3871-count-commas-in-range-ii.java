class Solution {
    public long countCommas(long n) {
        long a = 999_000L;
        long b = 999_000_000L * 2;
        long c = 999_000_000_000L * 3;
        long d = 999_000_000_000_000L * 4;

        int l = String.valueOf(n).length();
        long r = 0;

        if (l < 4) {
            return 0;
        } else if (l < 7) {
            // 1,000 → n
            return (n - 1_000L) + 1;
        } else if (l < 10) {
            // Complete 1-comma range
            r += a;

            // 1,000,000 → n
            long e = (n - 1_000_000L) + 1;
            r += e * 2;

            return r;
        } else if (l < 13) {
            // Complete 1-comma range
            r += a;

            // Complete 2-comma range
            r += b;

            // 1,000,000,000 → n
            long e = (n - 1_000_000_000L) + 1;
            r += e * 3;

            return r;
        } else if (l < 16) {
            // Complete 1-comma range
            r += a;

            // Complete 2-comma range
            r += b;

            // Complete 3-comma range
            r += c;

            // 1,000,000,000,000 → n
            long e = (n - 1_000_000_000_000L) + 1;
            r += e * 4;

            return r;
        } else {
            // Complete 1, 2, 3 and 4 comma ranges
            r += a;
            r += b;
            r += c;
            r += d;

            // 1,000,000,000,000,000 → n
            long e = (n - 1_000_000_000_000_000L) + 1;
            r += e * 5;

            return r;
        }
    }
}