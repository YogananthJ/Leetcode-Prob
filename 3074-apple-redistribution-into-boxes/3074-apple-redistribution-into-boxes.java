class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i:apple){
            sum+=i;
        }
        int c=1;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            if(capacity[i]<sum){
                c++;
               
            }
            if(sum<=0){
                break;
            } 
            sum-=capacity[i];

        }
        return c;
    }
}