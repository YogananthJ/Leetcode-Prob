class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean yes = false;
        int c=0;
        for(int i:arr){
            if(i%2!=0){
                c++;
            }
            else{
                c=0;
            }
            if(c==3){
                yes=true;
                break;
            }
        }
        return yes;
    }
}