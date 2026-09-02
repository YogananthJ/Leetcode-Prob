class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int x : nums) {
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int e = 0, o = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                nums[i] = even.get(e++);
            else
                nums[i] = odd.get(o++);
        }
        return nums;
    }
}