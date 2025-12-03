class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        String word = words[words.length-1];
        int c = word.length();
        return c;
    }
}