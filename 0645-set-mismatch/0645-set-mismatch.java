class Solution {
    public int[] findErrorNums(int[] nums) {
        int k=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    k=nums[j];
                    nums[j]=0;
                }
            }
        }
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[0]=k;
                arr[1]=(n*(n+1)/2)-sum;
            }
        }
        return arr;
    }
}