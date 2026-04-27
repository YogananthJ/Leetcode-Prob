class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        String r = "";
        int i = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }
            r += current;
            if (count > 1) {
                r += count;
            }
        }
        for (int j = 0; j < r.length(); j++) {
            chars[j] = r.charAt(j);
        }

        return r.length();
    }
}