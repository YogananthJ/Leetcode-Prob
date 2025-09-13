class Solution {
    public int[] getConcatenation(int[] nums) {
        nums = nums;
        int k=0;
        int[] nums1 = nums;
        int[] nums2 = new int[nums.length+nums1.length];
        for(int i=0;i<nums.length;i++){
            nums2[k]+=nums[i];
            k++;
        }
        for(int i=0;i<nums1.length;i++){
            nums2[k]+=nums1[i];
            k++;
        }
        return nums2;
    }
}