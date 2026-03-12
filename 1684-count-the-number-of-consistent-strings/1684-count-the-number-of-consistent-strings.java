class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        for(int i=0;i<words.length;i++){
            int a = words[i].length();
            String s = words[i];
            boolean[] isa = new boolean[s.length()];
            boolean all = false;
            for(int j=0;j<s.length();j++){
                for(int k=0;k<allowed.length();k++){
                    if(s.charAt(j)==allowed.charAt(k)){
                        isa[j] = true;
                    }
                }
            }
            System.out.println(s.length());
            for(int m = 0;m<s.length();m++){
                System.out.println(isa[m]);
                if(isa[m] == true){
                    all = true;
                }
                else
                {
                    all = false;
                    break;
                }
            }
            System.out.println("All " + all);
            if(all){
                c++;
            }
        }
        return c;

    }
}