class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for (int i : hours) c += (i >= target) ? 1 : 0;
        return c;
    }
}