class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int[] lastIdx = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            lastIdx[ch-'a']=i;
        }
        boolean[] seen = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(seen[ch-'a'])continue;
            while(!st.isEmpty() && st.peek()>ch && lastIdx[st.peek()-'a']>i){
                char removed=st.pop();
                seen[removed-'a']=false;
            }
            st.push(ch);
            seen[ch-'a']=true;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}