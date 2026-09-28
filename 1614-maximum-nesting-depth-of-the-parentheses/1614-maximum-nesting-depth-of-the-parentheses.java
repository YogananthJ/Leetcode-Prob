class Solution {
    public int maxDepth(String s) {
        int max = 0, c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
            }
            else if(s.charAt(i)==')'){
                c--;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}