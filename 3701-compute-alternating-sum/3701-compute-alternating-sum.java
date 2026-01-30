class Solution {
    public int alternatingSum(int[] nums) {
        int e=0, o=0, r=0;;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                e+=nums[i];
            }else{
                o+=nums[i];
            }
        }
        return e-o;
    }
}