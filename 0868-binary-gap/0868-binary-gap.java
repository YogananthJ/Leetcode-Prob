class Solution {
    public int binaryGap(int n) {
        int max=0,index=0;
        String s = Integer.toBinaryString(n);
        int m=0;
        for(int i=index;i<s.length();i++){
            if(s.charAt(i)=='1'){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        m=Math.max(m,j-i);

                        break;
                    }
                }
            }
            
        }
        return m;
    }
}