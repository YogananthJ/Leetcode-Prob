class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += nums.get(k);
                }

                int size = j - i + 1;

                if (size >= l && size <= r && sum > 0) {
                    list.add(sum);
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int a : list) {
            min = Math.min(min, a);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}