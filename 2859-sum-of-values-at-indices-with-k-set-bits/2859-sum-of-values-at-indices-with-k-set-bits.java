class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int a=Integer.parseInt(Integer.toBinaryString(i));
            int c=0;
            while(a!=0){
                int d=a%10;
                c=(d==1)?c+1:c;
                a=a/10;
            }
            if(c==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}