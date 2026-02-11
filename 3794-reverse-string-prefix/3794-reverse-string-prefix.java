class Solution {
    public String reversePrefix(String s, int k) {
        char[] a =new char[s.length()];
        int t=-1;
        if(k==1){
            return s;
        }
        else{
            for(int i=k-1;i>=0;i--){
                char b = s.charAt(i);
                ++t;
                a[t]=b;
                
            }
       
            for(int j=k;j<s.length();j++){
                char b = s.charAt(j);
                ++t;
                a[t]=b;
                
            }
        }
        String d = String.copyValueOf(a);
        return new String(a);
    }
}