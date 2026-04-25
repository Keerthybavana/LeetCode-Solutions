class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length%(1+i)==0){
                ans+=(nums[i]*nums[i]);
            }
        }
        return ans;
    }
}