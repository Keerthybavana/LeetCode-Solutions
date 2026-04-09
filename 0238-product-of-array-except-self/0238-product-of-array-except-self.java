class Solution {

    public int[] productExceptSelf(int[] nums) {


        int[] leftpro = new int[nums.length];
        leftpro[0] = 1;

        for(int i =1; i < nums.length; i++) {
            leftpro[i] = nums[i - 1] * leftpro[i - 1];
        }

        int[] rightpro = new int[nums.length];
        rightpro[nums.length - 1] = 1;

        for(int i = nums.length - 2; i >= 0; i--) {
            rightpro[i] = nums[i + 1] * rightpro[i + 1];
        }

        int[] output = new int[nums.length];
        for(int i =0; i < output.length; i++){
            output[i] = leftpro[i] * rightpro[i];
        }

        return output;


      
    }
}