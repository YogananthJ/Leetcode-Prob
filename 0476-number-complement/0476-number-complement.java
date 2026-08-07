class Solution {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        String result = a.replace("1", "x")
                   .replace("0", "1")
                   .replace("x", "0");
        return Integer.parseInt(result,2);
    }
}