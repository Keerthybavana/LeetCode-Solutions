class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }

        return count;
    }

    public boolean isSymmetric(int num) {
        String s = String.valueOf(num);

        if (s.length() % 2 != 0) return false;

        int mid = s.length() / 2;
        int left = 0, right = 0;

        for (int i = 0; i < mid; i++) {
            left += s.charAt(i) - '0';
            right += s.charAt(i + mid) - '0';
        }

        return left == right;
    }
}