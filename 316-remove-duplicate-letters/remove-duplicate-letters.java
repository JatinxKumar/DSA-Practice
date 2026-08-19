class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        Stack<Character> st = new Stack<>();
        boolean[] visited = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']==true){
                continue;
            }
            while (!st.isEmpty() && st.peek() > ch && last[st.peek() - 'a'] > i) {
                char removed=st.pop();
                visited[removed-'a']=false;
            }
            st.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}