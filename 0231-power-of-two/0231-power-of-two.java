class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ispower = false;
        for(int i=0;i<31;i++){
            int m = 1<<i;
        if(m==n){
            ispower = true;
            }
            else{
                m++;
            }
        }
        return ispower;
    
    }
}