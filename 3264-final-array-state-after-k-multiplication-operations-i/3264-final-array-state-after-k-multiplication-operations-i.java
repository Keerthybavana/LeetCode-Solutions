class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int i=0;
        while(i<k){
            int min=Integer.MAX_VALUE;
            int pos=0;
            for(int j=0;j<nums.length;j++){
                if(min>nums[j]){
                    min=nums[j];
                    pos=j;
                }
            }
            i++;
            nums[pos] *= multiplier;
        }
        return nums;
    }
}