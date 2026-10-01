class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                stack.add(s.charAt(i));
            }
            else if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']'){
                if (stack.isEmpty()) {
                    return false;
                }

                if (match(s.charAt(i)) == stack.peek()) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        System.out.println(stack.size());
        return (stack.isEmpty())?true:false;
    }

    private char match(char c) {

        if (c == ')')
            return '(';
        if (c == ']')
            return '[';
        if (c == '}')
            return '{';
        return '\0';
    }

}