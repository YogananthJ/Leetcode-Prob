class Solution {
    public int smallestIndex(int[] nums) {
       
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int sum = 0;
            while(n>0){
               sum+=(n%10);
               n=n/10;
            }
            if(sum==i){
                min = Math.min(min,sum);
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}