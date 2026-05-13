class Solution {
    public String reverseWords(String s) {
        String a = "";
        String[] c = s.split(" ");
        for(int i=0;i<c.length;i++){
            char[] b = c[i].toCharArray();
            int m = b.length-1;
            for(int j=0;j<b.length/2;j++){
                char temp = b[j];
                b[j]=b[b.length-1-j];
                b[b.length-1-j]=temp;
            }
            for(char t : b){
                a+=t;
            }
            if(i!=c.length-1){
                a+=" ";
            }
        }
        return a;
    }
}