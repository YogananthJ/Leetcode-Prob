import java.math.BigInteger;

class Solution {
    public int arraySign(int[] nums) {
        BigInteger a = BigInteger.ONE;

        for (int i : nums) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        
        return a.signum();
        
    }
}