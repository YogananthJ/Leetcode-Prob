class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                char a = jewels.charAt(i);
                char b = stones.charAt(j);
                if(a==b){
                    count++;
                }
            }
        }
        return count;
    }
}