class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int max = 0;
        HashSet<Character> ch = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            while (ch.contains(s.charAt(j))) {
                ch.remove(s.charAt(i));
                i++;
            }
            ch.add(s.charAt(j));
            max= Math.max(max, j - i + 1);
        }
        return max;       
    }
}