class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
   
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(max-nums[i]);
        }
        System.out.println(sum);
        return Math.abs(sum);
    }
}