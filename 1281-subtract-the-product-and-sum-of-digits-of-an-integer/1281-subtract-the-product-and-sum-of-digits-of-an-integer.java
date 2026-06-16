class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, div = 1;
        while (n > 0) {
            sum += (n % 10);

            div *= (n % 10);

            n = n / 10;

        }
     
        return div - sum;
    }
}