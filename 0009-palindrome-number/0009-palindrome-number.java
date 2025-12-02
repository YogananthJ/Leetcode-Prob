class Solution {
    public boolean isPalindrome(int x) {
        if(x<0|| (x%10==0&&x!=0)) return false;
        int p = 0;
        int o = x;
        while(x!=0){
            int d = x%10;
            p=p*10+d;
            x/=10;
        }
        if(p==o){
            return true;
        }else{
            return false;
        }
    }
}