class Solution {
    public int concatenatedBinary(int n) {
       long r = 0;
       int m = 1000000007;
       for(int i=1;i<=n;i++){
        int l = Integer.toBinaryString(i).length();
        r=(r << l)+i;
        r=r%m;
       } 
       return (int) r;
    }
}