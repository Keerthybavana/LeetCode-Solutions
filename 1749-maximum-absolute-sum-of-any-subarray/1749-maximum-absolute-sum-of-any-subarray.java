class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res=Math.abs(nums[0]);
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max+nums[i],nums[i]);
            min=Math.min(min+nums[i],nums[i]);
            res=Math.max(Math.max(Math.abs(max),Math.abs(min)),res);
        }
        return res;
    }
}