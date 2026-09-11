class Solution {
    public String[] findWords(String[] words) {
        String l1 = "qwertyuiop";
        String l2 = "asdfghjkl";
        String l3 = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String s = "";

            for (int j = 0; j < words[i].length(); j++) {
                String ch = String.valueOf(
                        Character.toLowerCase(words[i].charAt(j)));

                if (l1.contains(ch)) {
                    s += 1;
                } else if (!l2.contains(ch)) {
                    s += 2;
                } else if (!l3.contains(ch)) {
                    s += 3;
                }
            }
            list.add(s);
        }
        String[] r = new String[words.length];
        for(int i=0;i<list.size();i++){
            boolean yes = true;
            char a = list.get(i).charAt(0);
            for(int j=0;j<list.get(i).length();j++){
                if(a==list.get(i).charAt(j)){
                    yes = true;
                }
                else {
                    yes = false;
                    break;
                }
            }
            if(yes){
                r[i]=words[i];
            }
        }
        String[] result = Arrays.stream(r)
        .filter(Objects::nonNull)
        .toArray(String[]::new);
       
        return result;
    }
}
