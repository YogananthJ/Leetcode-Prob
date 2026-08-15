class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = Arrays.copyOf(heights,heights.length);
        Arrays.sort(exp);
        int c=0;
        for(int i=0;i<exp.length;i++){
            if(heights[i]!=exp[i]) c++;
        }
        return c;
    }
}