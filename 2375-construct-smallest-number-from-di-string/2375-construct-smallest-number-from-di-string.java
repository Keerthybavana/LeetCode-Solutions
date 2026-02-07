class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder res = new StringBuilder();
        int[] stack = new int[n + 1]; 
        int in = 0;

        for (int i = 0; i <= n; i++) {
            stack[in++] = i + 1;

            if (i == n || pattern.charAt(i) == 'I') {
                while (in > 0) {
                    res.append(stack[--in]);
                }
            }
        }
        return res.toString();
    }
}