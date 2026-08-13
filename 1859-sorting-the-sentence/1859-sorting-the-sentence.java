class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s1[j].contains(String.valueOf(i + 1))) {
                    if (i+1 == s1.length) {
                        sb.append(s1[j].substring(0, s1[j].length() - 1));
                    } else {
                        sb.append(s1[j].substring(0, s1[j].length() - 1) + " ");
                    }

                }
            }
        }
        return sb.toString();
    }
}