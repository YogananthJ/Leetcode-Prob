class Solution {
    public boolean isValid(String s) {
        Stack<Character> sat = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                sat.push(ch);
            }
            else
            {
                if(sat.isEmpty()) return false;
                char top = sat.pop();
                if(ch==')'&&top!='(') return false;
                if(ch==']'&&top!='[') return false;
                if(ch=='}'&&top!='{') return false;
            }
        }
        return sat.isEmpty();
    }
}