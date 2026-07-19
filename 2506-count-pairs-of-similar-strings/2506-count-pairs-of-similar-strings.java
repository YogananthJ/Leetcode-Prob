class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            char[] w = words[i].toCharArray();
            Set<Character> set = new TreeSet<>();
            for(char c : w){
                set.add(c);
            }
            StringBuilder sb = new StringBuilder();
            for(char ch:set){
                sb.append(ch);
            }
            words[i]=sb.toString();
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].equals(words[j])){
                    count++;
                }
            }
        }
        return count/2;
    }
}