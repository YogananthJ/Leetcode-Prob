class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[100];
        int m = String.valueOf(n).length();
        for (int i = 0; i < m; i++) {
            while (n > 0) {
                int d = n % 10;
                freq[d]++;
                n = n / 10;
            }
        }
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] < min && freq[i]!=0) {
                min = freq[i];
                index = i;
            }
        }

        System.out.println("Min frequency = " + min);
        System.out.println("Digit = " + index);
        System.out.println(m);
        return index;
    }
}