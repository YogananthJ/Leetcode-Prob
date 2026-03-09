class Solution {
    public String convertDateToBinary(String date) {
        String[] p = date.split("-");
        String r ="";
        for(int i=0;i<p.length;i++){
            int a = Integer.parseInt(p[i]);
            r+=Integer.toBinaryString(a);
            if(i==p.length-1) continue;
            r+='-';
        }
        return r;
    }
}