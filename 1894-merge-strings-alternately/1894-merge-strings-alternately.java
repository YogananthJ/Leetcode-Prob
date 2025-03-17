class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word = word1.length();
        int words = word2.length();
        String s="";
        int n=word>words?word:words;
        for(int i = 0;i<n;i++){
            if(i<word)
            {
                s+=word1.charAt(i);
            }
            if(i<words)
            {
                s+=word2.charAt(i);
            }
        }
        return s;
    }
}