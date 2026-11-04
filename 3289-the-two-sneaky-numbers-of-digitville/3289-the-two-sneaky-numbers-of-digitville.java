class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int k=0;
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    arr[k]=nums[i];
                    k++;
                }
            }
        }
        return arr;
    }
}