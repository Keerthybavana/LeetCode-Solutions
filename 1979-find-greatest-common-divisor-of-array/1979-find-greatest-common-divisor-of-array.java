class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0], max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        while(min>0 && max>0){
            if(max>min) max=max%min;
            else min=min%max;
        }        
        if(max==0) return min;
        return max;
    }
}