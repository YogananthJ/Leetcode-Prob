class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        int[] points1 = new int[points.length];
        for(int i=0;i<points.length;i++){
            points1[i]=points[i][0];
        }
        Arrays.sort(points1);
        
        for(int i=0;i<points1.length-1;i++){
            int d = points1[i+1]-points1[i];
            if(max<d){
                max = d;
            }
        }
        return max;
    }
}