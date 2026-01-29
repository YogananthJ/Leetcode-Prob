class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0, result=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        // if(sum%k==0){
        //     result=0;
        // }else if(k>sum){
        //     result=sum;
        // }else{
        //     result=k-1;
        // }
        result = sum%k;
        return result;
    }
}