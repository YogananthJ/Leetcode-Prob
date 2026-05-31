class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                right[i]+=nums[j];
            }
            for(int j=i;j>=0;j--){
                left[i+1]+=nums[j];
            }
        }
       
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            answer[i]=Math.abs(left[i]-right[i]);
        }
        return answer;
    }
}