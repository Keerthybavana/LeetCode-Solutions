class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,sum=0;
        int count=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(nums[j]==target) return 1;
            while(sum>=target && i<=j){
                count=Math.min(count,j-i+1);
                sum-=nums[i];
                i++;                                             
            }
            
        }
        return count==Integer.MAX_VALUE ? 0:count;
    }
}