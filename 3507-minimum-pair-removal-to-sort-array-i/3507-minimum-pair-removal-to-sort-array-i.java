class Solution {
    public int minimumPairRemoval(int[] nums) {
        int count=0;
        int n=nums.length;
        while(!prime(nums,n)){
             count++;
            int min=Integer.MAX_VALUE;
            int a=-1;
            for(int i=1;i<n;i++){
                int sum=nums[i-1]+nums[i];
                if(sum<min){
                    min=sum;
                    a=i;
                }
            }
            nums[a-1]=min;
            for(int i=a;i<n-1;i++){
                nums[i]=nums[i+1];
            }
           
            n--;
        } 
        return count;
    }
    public boolean prime(int[] nums,int n){
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]) return false;
        }
        return true;
    }
}