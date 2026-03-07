class Solution {
    public int minFlips(String s) {
        int n = s.length();
        s = s + s;
        StringBuilder alt1 = new StringBuilder();
        StringBuilder alt2 = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                alt1.append('0');
                alt2.append('1');
            } else {
                alt1.append('1');
                alt2.append('0');
            }
        }
        int res = Integer.MAX_VALUE;
        int diff1 = 0, diff2 = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != alt1.charAt(i)) diff1++;
            if(s.charAt(i) != alt2.charAt(i)) diff2++;
            if(i - j + 1 > n){
                if(s.charAt(j) != alt1.charAt(j)) diff1--;
                if(s.charAt(j) != alt2.charAt(j)) diff2--;
                j++;
            }

            if(i - j + 1 == n){
                res = Math.min(res, Math.min(diff1, diff2));
            }
        }
        return res;
    }
}