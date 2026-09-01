class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder r = new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(k < spaces.length && i == spaces[k]){
                r.append(" ");
                k++;
            }
            r.append(s.charAt(i));
        }
        return r.toString();
    }
}