import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n = new BigInteger(a,2);
        BigInteger m = new BigInteger(b,2);
        BigInteger bin = n.add(m);
        return bin.toString(2);
    }
}