class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=1;i<=num;i++){
            int n=i,m=0;
            while(n>0){
                int d=n%10;
                m+=d;
                n=n/10;
            }
            System.out.println(m);
            c+=(m%2==0)?1:0;
        }
        return c;
    }
}