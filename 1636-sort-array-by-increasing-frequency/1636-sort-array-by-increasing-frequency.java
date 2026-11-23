class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] a = Arrays.stream(nums)
                            .boxed()
                            .toArray(Integer[]::new);

        // Sort based on frequency
        Arrays.sort(a, (x, y) -> {
            if (!freq.get(x).equals(freq.get(y))) {
                return freq.get(x) - freq.get(y);
            }
            return y - x;
        });

        for(int i=0;i<nums.length;i++){
            nums[i]=a[i];
        }
        return nums;
    }
}        
