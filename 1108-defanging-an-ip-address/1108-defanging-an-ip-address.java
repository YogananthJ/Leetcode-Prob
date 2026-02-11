class Solution {
    public String defangIPaddr(String address) {
        String s="";
        for(int i=0;i<address.length();i++)
        {
            char b=address.charAt(i);
            if(b=='.')
            {
                s+="[.]";
                
                
            }
            else
            {
                s+=b;
            }
        }
        return s;
    }
}