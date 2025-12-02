class Solution {
    public int reverse(int x) {
        long rev = 0;   // use long to safely store reversed number

        while (x != 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x /= 10;
        }

        // If reversed number goes out of int range, return 0
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}
