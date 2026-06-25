class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            if (st.size() >= part.length()) {
                boolean match = true;
                for (int j = 0; j < part.length(); j++) {
                    if (st.get(st.size() - part.length() + j) != part.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    for (int j = 0; j < part.length(); j++) {
                        st.pop();
                    }
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (char ch : st) {
            res.append(ch);
        }
        return res.toString();
    }
}