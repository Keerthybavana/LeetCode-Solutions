class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        /*
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-1]+nums[n-2]-nums[0];*/
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
            if(max<nums[i]) max=nums[i];
        }

        int count=0; 
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]) count++;
            if(max>nums[i] && maxx<nums[i]){
                maxx=nums[i];
            }
        }
        if(count!=1){
            maxx=max;
        }
        return max+maxx-min;
    }
}