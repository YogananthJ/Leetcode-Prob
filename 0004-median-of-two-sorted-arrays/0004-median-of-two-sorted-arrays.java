class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int[] nums3 = new int[n];
        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums3[nums1.length+i]=nums2[i];
        }
        // for(int i:nums3){
        //     System.out.println(i);
        // }
        int m = nums3.length;
        Arrays.sort(nums3);
        if(nums3.length%2!=0){
            return (double)(nums3[m/2]);
        }
        else{
            return(double)(nums3[m/2]+nums3[m/2-1])/2;
        }
        
    }
}