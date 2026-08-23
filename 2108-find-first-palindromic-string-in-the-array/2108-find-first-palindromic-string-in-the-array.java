class Solution {
    public String firstPalindrome(String[] words) {
        String b="";
        for(String s:words){
            String a = new StringBuilder(s).reverse().toString();
            if(a.equals(s)){
                b=s;
            }
            if(b.length()!=0) break;
        }
        return b;
    }
}