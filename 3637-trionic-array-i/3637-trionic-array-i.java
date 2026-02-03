class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums[0]>nums[1]) return false;
        int p=0, q=0;
        for(int i=0;i<nums.length-1;i++){
            if(p==0 && nums[i]>nums[i+1]) p++;
            else if(p==1 && q==1 && nums[i]>nums[i+1]) return false;
            else if(p==1 && nums[i]<nums[i+1] && q==0) q++;
            else if(nums[i]==nums[i+1]) return false;
        }
        if(p==1 && q==1) return true;
        return false;
    }
}