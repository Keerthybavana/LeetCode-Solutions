class Solution {
    public int countSubarrays(int[] nums) {
        int sum=0;
       
        for(int j=0;j<nums.length-2;j++){
            if(2*(nums[j]+nums[j+2])==nums[j+1]) sum++;
        }
        return sum;
    }
}