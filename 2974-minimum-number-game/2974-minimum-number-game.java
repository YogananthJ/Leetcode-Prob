class Solution {
    public int[] numberGame(int[] nums) {
       // Manual sort (Bubble Sort)
for (int i = 0; i < nums.length - 1; i++) {
    for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
            int temp = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = temp;
        }
    }
}

// Swap adjacent elements
for (int i = 0; i < nums.length; i += 2) {
    int temp = nums[i];
    nums[i] = nums[i + 1];
    nums[i + 1] = temp;
}

return nums;
    }
}