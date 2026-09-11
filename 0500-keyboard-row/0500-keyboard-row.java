class Solution {
    public String[] findWords(String[] words) {
        String l1 = "qwertyuiop";
        String l2 = "asdfghjkl";
        String l3 = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String s = String.valueOf(Character.toLowerCase(words[i].charAt(0)));

            if (l1.contains(s)) {

                boolean valid = true;

                for (int j = 0; j < words[i].length(); j++) {
                    String ch = String.valueOf(Character.toLowerCase(words[i].charAt(j)));

                    if (!l1.contains(ch)) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    list.add(words[i]);
                }

            } else if (l2.contains(s)) {

                boolean valid = true;

                for (int j = 0; j < words[i].length(); j++) {
                    String ch = String.valueOf(Character.toLowerCase(words[i].charAt(j)));

                    if (!l2.contains(ch)) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    list.add(words[i]);
                }

            } else {

                boolean valid = true;

                for (int j = 0; j < words[i].length(); j++) {
                    String ch = String.valueOf(Character.toLowerCase(words[i].charAt(j)));

                    if (!l3.contains(ch)) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    list.add(words[i]);
                }
            }
        }

        return list.toArray(new String[0]);
    }
}
