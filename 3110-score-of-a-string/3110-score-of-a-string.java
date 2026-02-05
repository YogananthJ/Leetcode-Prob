class Solution {
    public int scoreOfString(String s) {
        int a =0;
        for(int i=1;i<s.length();i++){
            int b=0;
            int c=s.charAt(i-1);
            int e=s.charAt(i);
            b=(int)c-e;
            int q=Math.abs(b);
            a+=q;
        }
        return a;
    }
}