class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left[i]=0;
            }
            else{
                sum+=nums[i-1];
                left[i]=sum;
            }
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
               right[i]=sum;
               sum+=nums[i];           
        }
        for(int i=0;i<nums.length;i++){
            if(right[i]>left[i]){
                nums[i]=right[i]-left[i];
            }
            else{
                nums[i]=left[i]-right[i];
            }
        }
        return nums;
    }
}