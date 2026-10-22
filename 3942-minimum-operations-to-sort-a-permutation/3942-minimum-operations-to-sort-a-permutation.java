class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        while (nums[zero] != 0) {
            zero++;
        }

        // Case 1: Rotate the original array
        boolean canRotate = true;

        for (int i = 0; i < n; i++) {
            if (nums[(zero + i) % n] != i) {
                canRotate = false;
                break;
            }
        }

        int ans = Integer.MAX_VALUE;

        if (canRotate) {
            // Direct left rotations, or use reversals
            ans = Math.min(zero, n - zero + 2);
        }

        // Case 2: Reverse first, then rotate
        int revZero = n - 1 - zero;
        boolean canReverseRotate = true;

        for (int i = 0; i < n; i++) {
            int idx = n - 1 - ((revZero + i) % n);

            if (nums[idx] != i) {
                canReverseRotate = false;
                break;
            }
        }

        if (canReverseRotate) {
            ans = Math.min(ans,
                    Math.min(revZero + 1, n - revZero + 1));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}