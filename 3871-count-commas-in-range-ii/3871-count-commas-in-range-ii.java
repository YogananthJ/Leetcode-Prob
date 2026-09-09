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
            return (n - 1_000L) + 1;
        } else if (l < 10) {
            r += a;

            long e = (n - 1_000_000L) + 1;
            r += e * 2;

            return r;
        } else if (l < 13) {
            r += a;

            r += b;

            long e = (n - 1_000_000_000L) + 1;
            r += e * 3;

            return r;
        } else if (l < 16) {
            r += a;

            r += b;

            r += c;

            long e = (n - 1_000_000_000_000L) + 1;
            r += e * 4;

            return r;
        } else {
            r += a;
            r += b;
            r += c;
            r += d;

            long e = (n - 1_000_000_000_000_000L) + 1;
            r += e * 5;

            return r;
        }
    }
}