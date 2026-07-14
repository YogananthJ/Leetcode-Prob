class Solution {
    public int findClosest(int x, int y, int z) {
        int min = Integer.MAX_VALUE;
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);
        min = Math.min(min, a);
        min = Math.min(min, b);
        if (min == a && min == b) {
            return 0;
        } else if (min == a) {
            return 1;
        } else if (min == b) {
            return 2;
        }
        return 0;
    }
}