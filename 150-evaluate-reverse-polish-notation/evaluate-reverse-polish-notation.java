class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int val2 = s.pop();
                int val1 = s.pop();
                int result = 0;

                switch (token) {
                    case "+": result = val1 + val2; break;
                    case "-": result = val1 - val2; break;
                    case "*": result = val1 * val2; break;
                    case "/": result = val1 / val2; break; 
                }
                s.push(result);
            }else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}