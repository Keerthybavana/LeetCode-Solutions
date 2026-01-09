class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < nums1.length; i++) sum1 += nums1[i];
        for (int i = 0; i < nums2.length; i++) sum2 += nums2[i];

        if (sum1 == sum2) return 0;
        if (sum1 > sum2) return minOperations(nums2, nums1);

        int diff = sum2 - sum1;
        int[] gainCount = new int[6];
        for (int i = 0; i < nums1.length; i++) {
            gainCount[6 - nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            gainCount[nums2[i] - 1]++;
        }
        int ops = 0;
        for (int g = 5; g >= 1 && diff > 0; g--) {
            while (gainCount[g] > 0 && diff > 0) {
                diff -= g;
                gainCount[g]--;
                ops++;
            }
        }
        return diff > 0 ? -1 : ops;
    }
}
