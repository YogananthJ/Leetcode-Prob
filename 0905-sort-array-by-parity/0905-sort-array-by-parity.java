class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] nums1 = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
        }

        Arrays.sort(nums1, (a, b) -> Integer.compare(a % 2, b % 2));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums1[i];
        }
        return nums;
    }
}