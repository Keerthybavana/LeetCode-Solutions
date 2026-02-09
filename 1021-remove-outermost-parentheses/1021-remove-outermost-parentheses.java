class Solution {
    public String removeOuterParentheses(String s) {
        if (s.length() <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int open = 1;
        int openLeft = 0;
        for (int i = 1; i < s.length(); i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) sb.append('(');
            }
            else {
                if (open > 1) sb.append(')');
                open--;
            }
        }
        return sb.toString();
    }
}