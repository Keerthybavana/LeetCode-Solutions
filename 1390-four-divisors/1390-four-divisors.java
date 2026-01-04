class Solution {
    public int sumFourDivisors(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            int sum=0;
            for(int j=1;j*j<=nums[i];j++){
                
                if(nums[i]%j==0){
                    count++;
                    sum+=j;
                    if(j!=1 && nums[i]/j!=j) {
                        sum+=(nums[i]/j);
                        count++;
                    }
                }
            }
            if(count==4) {
                max+=sum+nums[i];
            }
        }
        return max;
    }
}