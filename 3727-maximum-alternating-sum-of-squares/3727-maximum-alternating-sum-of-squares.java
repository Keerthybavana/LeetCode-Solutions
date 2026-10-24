class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum=0;
        long min=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2) sum+=nums[i];
            else min+=nums[i];
        }
        return min-sum; 
        /*
        long sum=0;
        if(nums.length%2==0) {
        for(int i=1;i<nums.length-1;i+=2){
            sum=-nums[0];
           if(nums[i]>nums[i+1]) {
             sum+=nums[i];
             sum-=nums[i+1];
           }
            else{
                sum+=nums[i+1];
                sum-=nums[i];
            }
        }
        return sum+nums[nums.length-1];
        }
        else{
            for(int i=0;i<nums.length-1;i+=2){
                if(nums[i]<nums[i+1]) {
                    sum+=nums[i+1];
                    sum-=nums[i];
                }
                else {
                    sum+=nums[i];
                    sum-=nums[i+1];
                }
            }
            return sum-nums[nums.length-1];
        }
    */
    }
}