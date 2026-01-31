class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k=-1, t=0;;
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    index[++k]=i;
                    index[++k]=j;
                    return index;
                }
            }
        }
        return index;
    }
}