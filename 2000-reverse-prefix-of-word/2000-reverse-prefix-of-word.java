class Solution {
    public String reversePrefix(String word, char ch) {
        int n=-1, k=-1, t=1;
        char[] s1 = word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(s1[i]==ch){
                n=i;
                break;
            }
        }
        if(n==-1) return word;
        for(int i=n;i>=0;i--){
            s1[++k]=word.charAt(i);
            
        }
        for(int j=n+1;j<word.length();j++){
            s1[++k]=word.charAt(j);
        }
        String word1 = new String(s1);
        return word1;
    }
}