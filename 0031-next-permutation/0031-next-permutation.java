class Solution {
    public void nextPermutation(int[] nums) {
      int p=nums.length-2;
      while(p>=0 && nums[p]>=nums[p+1]){
        p--;
      }
      if(p>=0){
        int k=nums.length-1;
        while(nums[k]<=nums[p]){
            k--;
        }
        swap(nums,p,k);
             
      }
      reverse(nums,p+1,nums.length-1);   
    }
     private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
      }
      private void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;j--;
        }
      }
}