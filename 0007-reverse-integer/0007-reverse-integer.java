class Solution {
    public int reverse(int x) {
        long rem = 0;

        while (x != 0) {
            int dig = x % 10;
            rem = rem * 10 + dig;
            x /= 10;
        }
        if (rem > Integer.MAX_VALUE || rem < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rem;
    }
}
