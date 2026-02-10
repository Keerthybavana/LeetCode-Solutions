class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i], sum=0;
            while(temp!=0){
                int rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}