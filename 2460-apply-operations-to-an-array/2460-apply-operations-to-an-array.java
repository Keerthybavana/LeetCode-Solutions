class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && nums[i]!=0){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int i=0,j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==0){
                if(nums[j]!=0){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }
        return nums;
    }
}