class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.reverse();
       
        int n=Integer.parseInt(sb.toString());
        sb.setLength(0);
        sb.append(n);
        sb.reverse();
        
        return num==Integer.parseInt(sb.toString());
    }
}