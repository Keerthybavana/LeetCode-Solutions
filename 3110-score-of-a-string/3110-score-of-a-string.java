class Solution {
    public int scoreOfString(String s) {
        int acii=0;
        for(int i=0;i<s.length()-1;i++){
            acii+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return acii;
    }
}