class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int i=0,j=0;
        while(i<n){
            arr[j]=nums[i];
            arr[j+1]=nums[i+n];
            j+=2;
            i++;
        }
        return arr;
    }
}