class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n = nums1.length, sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1+=nums1[i];
            sum2+=nums2[i];
        }
        return (sum2-sum1)/n;
    }
}