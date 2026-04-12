import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        HashSet<Integer> v = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (v.contains(nums[i])) continue;

            int s = nums[i];
            v.add(s);

            List<Integer> r = new ArrayList<>();

            // collect indices of same value
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == s) {
                    r.add(j);
                }
            }

            // only if at least 3 occurrences
            if (r.size() >= 3) {

                // try all combinations of 3 indices
                for (int a = 0; a < r.size(); a++) {
                    for (int b = a + 1; b < r.size(); b++) {
                        for (int c = b + 1; c < r.size(); c++) {

                            int i1 = r.get(a);
                            int i2 = r.get(b);
                            int i3 = r.get(c);

                            int sum = Math.abs(i1 - i2)
                                    + Math.abs(i2 - i3)
                                    + Math.abs(i3 - i1);

                            min = Math.min(min, sum);
                        }
                    }
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}