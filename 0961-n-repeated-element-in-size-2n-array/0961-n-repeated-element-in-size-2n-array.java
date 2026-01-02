class Solution {
    public int repeatedNTimes(int[] nums) {
        int m =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    m = nums[i];
                }
            }
        }
        return m;
    }
}