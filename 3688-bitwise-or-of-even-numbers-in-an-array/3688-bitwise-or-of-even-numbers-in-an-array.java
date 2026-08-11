class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int a=0;
        for(int i:nums){
            if(i%2==0){
                a=a|i;
            }
        }
        return a;
    }
}