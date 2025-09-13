class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length+nums2.length;
        int[] mer = new int[m];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            mer[k]=nums1[i];
            k++;
        }
        for(int j=0;j<nums2.length;j++){
            mer[k]=nums2[j];
            k++;
        }
        double median;
        Arrays.sort(mer);
        int n=mer.length;
        if(n%2==0){
           median = (mer[(n/2)-1] + mer[n/2])/2.0;
        }else{
            median = mer[n/2];
        }
        return median;
    }
}