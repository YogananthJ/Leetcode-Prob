class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean valid = false;
        String a="";
        for(int i=0;i<words.size();i++){
            a+=words.get(i).charAt(0);
        }
        if(a.equals(s)) return true;
        return false;
    }
}