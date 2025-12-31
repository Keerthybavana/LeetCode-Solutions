class Solution {
    public int maxProduct(int[] nums) {
        int maxpro = nums[0];
        int minpro = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr < 0) {
                int temp = maxpro;
                maxpro = minpro;
                minpro = temp;
            }
            maxpro = Math.max(curr, curr * maxpro);
            minpro = Math.min(curr, curr * minpro);
            res = Math.max(res, maxpro);
        }
        return res;
    }
}
