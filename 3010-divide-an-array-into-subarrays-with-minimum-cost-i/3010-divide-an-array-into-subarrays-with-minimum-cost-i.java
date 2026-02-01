class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length<3) return 0;
        if(nums.length==3) return nums[1]+nums[2]+nums[0];
        int min=Integer.MAX_VALUE;
        int minn=Integer.MAX_VALUE;
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                k=i;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(minn>nums[i] && min<=nums[i] && k!=i) minn=nums[i];
        }
        return nums[0]+min+minn;
    }
}