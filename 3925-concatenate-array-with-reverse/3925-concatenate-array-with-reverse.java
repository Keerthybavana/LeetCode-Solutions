class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr=new int[2*nums.length];
        int i=0,j=arr.length-1;
        while(i<j){
            arr[i]=nums[i];
            arr[j]=nums[i];
            i++;j--;
        }
        return arr;
    }
}