class Solution {
    public int balancedStringSplit(String s) {
        int c =0, b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                b--;
            }
            else
            {
                b++;
            }
            if(b==0){
                c++;
            }
        }
        return c;
    }
}