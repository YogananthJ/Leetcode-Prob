class Solution {
    public int minimumSum(int num) {
        char[] s = String.valueOf(num).toCharArray();
        Arrays.sort(s);
        int a = Integer.valueOf(""+s[0]+s[2]);
        int b = Integer.valueOf(""+s[1]+s[3]);
        return a+b;
    }
}