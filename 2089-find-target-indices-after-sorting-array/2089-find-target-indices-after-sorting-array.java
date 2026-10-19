class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int num = 0; num < nums.length; num++) {
            if (nums[num] == target) {
                list.add(num);
            }
        }
        return list;
    }
}