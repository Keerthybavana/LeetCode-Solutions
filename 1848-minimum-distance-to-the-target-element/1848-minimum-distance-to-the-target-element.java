class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int res=Math.abs(i-start);
            if(nums[i]==target && min>res) {
                min=res;
            }
        }
        return min;
    }
}