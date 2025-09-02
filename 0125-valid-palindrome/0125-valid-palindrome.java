class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(s.isEmpty()){
            return true;
        }else{
            boolean isPalindrome=true;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
    }
}