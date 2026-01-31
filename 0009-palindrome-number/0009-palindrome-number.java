class Solution {
    public boolean isPalindrome(int x) {
        boolean ispal = false;
        int y=x;
        int rev =0;
        while(x>0){
            
            rev = (rev*10)+x%10;
            x=x/10;
        }
        if(y==rev){
            ispal=true;
        }
        return ispal;
    }
}