class Solution {
    public int numberOfSpecialChars(String word) {
        int c = 0;
      
        for (char ch = 'a'; ch <= 'z'; ch++) {

            int upper = word.indexOf(Character.toUpperCase(ch));
            int lower = word.lastIndexOf(ch);

            
            if (lower != -1 && upper != -1 && lower < upper) {
                c++;
            }
        }
        System.out.println(word.lastIndexOf('a')+" "+word.lastIndexOf('A'));
        return c;
    }
}