class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Stack<Integer> st = new Stack<>();
        int currNo = 0;
        char sign = '+';
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                currNo = currNo * 10 + (ch - '0');
            }
            
            if ((!Character.isDigit(ch) && ch != ' ') || i == n - 1) {
                if (sign == '+') {
                    st.push(currNo);
                } else if (sign == '-') {
                    st.push(-currNo);
                } else if (sign == '*') {
                    st.push(st.pop() * currNo);
                } else if (sign == '/') {
                    st.push(st.pop() / currNo);
                }
                
                sign = ch;
                currNo = 0;
            }
        }
        
        int result = 0;
        while (!st.isEmpty()) {
            result += st.pop();
        }
        
        return result;
    }
}