class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int a = 0, b = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = Math.max(b, nums[i] + a);
            a = b;
            b = temp;
        }
        int first= b;

        a = 0;
        b = 0;

        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(b, nums[i] + a);
            a = b;
            b = temp;
        }
        int second= b;

        return Math.max(first, second);
    }
}
