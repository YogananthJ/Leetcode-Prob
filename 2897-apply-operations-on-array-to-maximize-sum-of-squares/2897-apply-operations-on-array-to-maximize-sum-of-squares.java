class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long MOD = 1000000007;
        
        // Step 1: Count how many numbers contain each bit
        int[] count = new int[31];

        for (int num : nums) {
            for (int bit = 0; bit < 31; bit++) {
                if ((num & (1 << bit)) != 0) {
                    count[bit]++;
                }
            }
        }

        long answer = 0;

        // Step 2: Build k maximum numbers
        for (int i = 0; i < k; i++) {
            long num = 0;

            for (int bit = 0; bit < 31; bit++) {
                if (count[bit] > 0) {
                    num |= (1L << bit);
                    count[bit]--;
                }
            }

            // Step 3: Add the square modulo MOD
            answer = (answer + num * num) % MOD;
        }

        return (int) answer;
    }
}