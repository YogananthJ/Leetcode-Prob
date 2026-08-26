class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum =0;
        int[] freq = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0&&freq[i]%k==0){
                sum+=(i*freq[i]);
              
            }
        }
        return sum;
    }
}