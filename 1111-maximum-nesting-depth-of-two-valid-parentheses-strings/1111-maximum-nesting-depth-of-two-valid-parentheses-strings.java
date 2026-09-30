class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depth = 0;
        int[] ans = new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                depth++;
                if(depth%2==0){
                    ans[i]=1;
                }
                else
                {
                    ans[i]=0;
                }
            }
            else if(seq.charAt(i)==')'){
                if(depth%2==0){
                    ans[i]=1;
                }
                else
                {
                    ans[i]=0;
                }
                depth--;
            }
        }
        return ans;
    }
}