import java.math.BigInteger;
class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s", 
        Integer.toBinaryString(n))
        .replace(' ', '0');
        String rev = new StringBuilder(binary).reverse().toString();
        BigInteger big = new BigInteger(rev,2);
        return big.intValue();
    }
}