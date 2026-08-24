class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];

        for (int i = 0; i < nums1.length; i++) {
            for (int j : nums2) {
                if (nums1[i] == j) {
                    result[0]++;
                    break; 
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j : nums1) {
                if (nums2[i] == j) {
                    result[1]++;
                    break; 
                }
            }
        }

        return result;
    }
}