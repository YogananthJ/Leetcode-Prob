class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(sb);
                sb = new StringBuilder();
            }

            else if (s.charAt(i) == ')') {
                sb.reverse();

                StringBuilder previous = stack.pop();
                previous.append(sb);

                sb = previous;
            }

            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
