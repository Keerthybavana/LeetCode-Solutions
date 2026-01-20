class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        res.add(""); 

        for (int i = 0; i < n; i++) {
            List<String> next = new ArrayList<>();

            for (String s : res) {
                next.add(s + "1");
                if (s.length() == 0 || s.charAt(s.length() - 1) != '0') {
                    next.add(s + "0");
                }
            }
            res = next;
        }
        return res;
    }
}
