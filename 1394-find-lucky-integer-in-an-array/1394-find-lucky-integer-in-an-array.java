class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int [501];
        for(int i:arr){
            freq[i]++;
        }
        int max = -1;
        for(int i:arr){
            if(freq[i]==i){
                max=Math.max(max,i);
            }
        }
        return max;
    }
}