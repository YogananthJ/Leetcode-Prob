class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];

        // Square each element
        for (int i = 0; i < nums.length; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }

        // Sort using your logic
        Arrays.sort(arr);

        long minus = 0;
        int mid = arr.length / 2;

        // Subtract the first half
        for (int i = 0; i < mid; i++) {
            minus -= arr[i];
        }

        // Add the second half
        for (int i = mid; i < arr.length; i++) {
            minus += arr[i];
        }

        return minus;
    }
}