class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int i=n;
        int m=1;
        while(i!=0){
            sum +=i%10;
            m *=i%10;
            i/=10;
        }
        sum+=m;
        return n%sum==0;
    }
}