class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {

    if (Character.isDigit(operations[i].charAt(0)) ||
        operations[i].charAt(0) == '-') {

        stack.push(Integer.parseInt(operations[i]));
    }

    else if (operations[i].equals("D")) {
        int sum = stack.peek() * 2;
        stack.push(sum);
    }

    else if (operations[i].equals("C")) {
        stack.pop();
    }

    else if (operations[i].equals("+")) {
        int last = stack.pop();
        int secondLast = stack.peek();

        int sum = last + secondLast;

        stack.push(last);
        stack.push(sum);
    }
}
        int sum1=0;
        for (int i = 0; i < stack.size(); i++) {
            sum1 += stack.get(i);
        }

        return sum1;
    }
}