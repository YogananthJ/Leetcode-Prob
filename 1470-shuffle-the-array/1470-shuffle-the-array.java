class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=-1;
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[nums.length];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }
         int j=0;
        for(int i=n;i<nums.length;i++){
           
            b[j]=nums[i];
            j++;
        }
        for(int i=0;i<n;i++){
            c[++k]=a[i];
            c[++k]=b[i];
        }
        return c;
    }
}