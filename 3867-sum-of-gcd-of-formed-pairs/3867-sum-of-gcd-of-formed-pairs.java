import java.util.*;

class Solution {

    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
            list.add(gcd(num, max));
        }

        Collections.sort(list);

        long sum = 0;
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            sum += gcd(list.get(left), list.get(right));
            left++;
            right--;
        }

        return sum;
    }
}