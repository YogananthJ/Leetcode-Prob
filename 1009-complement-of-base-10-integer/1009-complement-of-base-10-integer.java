class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        String r = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                r+='0';
            }
            else
            {
                r+='1';
            }
        }
        return Integer.parseInt(r,2);
    }
}