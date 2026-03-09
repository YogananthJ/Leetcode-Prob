class Solution {
    public String convertDateToBinary(String date) {
        String[] p = date.split("-");
        int y = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int d = Integer.parseInt(p[2]);
        String r = Integer.toBinaryString(y)+'-'+Integer.toBinaryString(m)+'-'+Integer.toBinaryString(d);
        return r;
    }
}