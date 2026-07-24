class Solution {
    public int pivotInteger(int n) {
       int sum =0;
       for(int i=0;i<=n;i++){
        sum+=i;
       }
       int root = (int)Math.sqrt(sum);
        return (root*root==sum)?root:-1; 
    }
}