class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a = x;
        int sum =0;
        while(a!=0){    
            sum+=a%10;
            a/=10;
        }
        return (x%sum==0)?sum:-1;
    }
}