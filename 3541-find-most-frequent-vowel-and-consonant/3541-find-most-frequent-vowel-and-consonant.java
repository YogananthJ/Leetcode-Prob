class Solution {
    public int maxFreqSum(String s) {
        int mc = 0;
        int mv = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    c++;
                }
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (c > mv) {
                    mv = c;
                } 
                }
                else {
                    if (c > mc) {
                        mc = c;
                    }
                
            }

        }
        return mv + mc;
    }
}