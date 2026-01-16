class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) neg[k++]=nums[i];
            else pos[j++]=nums[i];
        }
        k=0;j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) nums[i]=pos[k++];
            else nums[i]=neg[j++];
        }
        return nums;
    }
}