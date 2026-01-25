class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        if(nums.length==2) return nums[0]+nums[1];
        int sum=0, count=0;
        for(int i=nums.length-1;i>=0;i--){
            count++;
            if(count<3) sum+=nums[i];
            else count=0;
        } 
        return sum;
    }
}