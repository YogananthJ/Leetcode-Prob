class Solution {
    public String makeGood(String s) {

        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char x : arr) {
            stack.push(x);
        }

        boolean changed = true;

        while (changed) {

            changed = false;

            Stack<Character> temp = new Stack<>();

            for (int i = 0; i < stack.size(); i++) {

                char current = stack.get(i);

                if (i < stack.size() - 1) {

                    char next = stack.get(i + 1);

                    // Same letter, opposite case
                    if (Character.toLowerCase(current) ==
                            Character.toLowerCase(next)
                            && current != next) {

                        changed = true;

                        // Skip both characters
                        i++;

                        continue;
                    }
                }

                temp.push(current);
            }

            stack = temp;
        }

        StringBuilder result = new StringBuilder();

        for (char x : stack) {
            result.append(x);
        }

        return result.toString();
    }
}
