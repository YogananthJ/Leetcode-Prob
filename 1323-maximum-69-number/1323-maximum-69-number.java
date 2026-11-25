class Solution {
    public int maximum69Number (int num) {
        if(!String.valueOf(num).contains("6")) return num;
        char[] c1 = String.valueOf(num).toCharArray();
   
        int max = 0;
        for(int i=0;i<c1.length;i++){
            if(c1[i]-'0'==9){
                c1[i]='6';
            }
            else if(c1[i]-'0'==6){
                c1[i]='9';
            }
            max=Math.max(max,Integer.parseInt(new String(c1)));
            if(c1[i]-'0'==6){
                c1[i]='9';
            }
            else if(c1[i]-'0'==9){
                c1[i]='6';
            }
        }
     
        return max;
    }
}