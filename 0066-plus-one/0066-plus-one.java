class Solution {
    public int[] plusOne(int[] digits) {

    int n = digits.length;

    // Loop from last digit backwards
    for (int i = n - 1; i >= 0; i--) {

        digits[i]++;          // increment the digit
        if (digits[i] < 10) {  // no carry
            return digits;     // done
        }

        digits[i] = 0; // digit was 9, now becomes 0 (carry continues)
    }

    // If we reach here: all digits were 9
    int[] newDigits = new int[n + 1];
    newDigits[0] = 1; // Example: 999 + 1 = 1000
    return newDigits;
}

}