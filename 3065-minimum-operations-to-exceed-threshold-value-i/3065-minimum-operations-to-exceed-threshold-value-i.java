class Solution {
    public int minOperations(int[] nums, int k) {
        int i=0, j=nums.length-1, count=0;
        while(i<=j){
            if(nums[i]<k && i!=j) count++;
            if(nums[j]<k) count++;
            i++;j--;
        }
        return count;
    }
}