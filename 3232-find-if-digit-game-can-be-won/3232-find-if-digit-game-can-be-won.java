class Solution {
    public boolean canAliceWin(int[] nums) {
        int s= 0,d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                d+=nums[i];
            }
            else
            {
                s+=nums[i];
            }
        }
        return s!=d;
    }
}