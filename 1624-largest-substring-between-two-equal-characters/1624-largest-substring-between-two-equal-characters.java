class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int c=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    String a=s.substring(i,j);
                    c=Math.max(c,a.length()-1);
                   
                }
                
            }
        }
        return (c==Integer.MIN_VALUE)?-1:c;
    }
}