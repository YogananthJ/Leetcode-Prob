class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] s11 = s1.toCharArray();
        char[] s22 = s2.toCharArray();
        String e = "";
        String o = "";
        String e1 = "";
        String o1 = "";
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                e+=s11[i];
                e1+=s22[i];
            }
            else
            {
                o+=s11[i];
                o1+=s22[i];
            }
        }
        char[] a = o.toCharArray();
        char[] b = o1.toCharArray();
        char[] c = e.toCharArray();
        char[] d = e1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        Arrays.sort(d);
        boolean ev = false, od = false;
        if(Arrays.equals(a,b)){
            od=true;
        } 
        
        if(Arrays.equals(c,d)){
            ev=true;
        }
        if(ev && od) {
            return true;
        }
        return false;
    }
}