class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                c++;
            }
        }
        if(c>0){
            return true;
        }
        return false;
    }
}