class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            int m = 0;
            for(;n>0;n=n/10){
                m+=(n%10);
               
            }
            min=Math.min(min,m);
        }
        return min;
    }
}