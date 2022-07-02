class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                    case '[':
                        st.push(']');
                        break;
                    case '(':
                        st.push(')');
                        break;
                    case '{':
                        st.push('}');
                        break;
                default:
                    if(st.isEmpty() || st.pop() != c)
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
}