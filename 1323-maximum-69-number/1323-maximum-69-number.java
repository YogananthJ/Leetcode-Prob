class Solution {
    public int maximum69Number (int num) {
        char[] c1 = String.valueOf(num).toCharArray();
   
      
        for(int i=0;i<c1.length;i++){
            if(c1[i]=='6'){
                c1[i]='9';
                break;
            }
        }
     
        return Integer.parseInt(new String(c1));
    }
}