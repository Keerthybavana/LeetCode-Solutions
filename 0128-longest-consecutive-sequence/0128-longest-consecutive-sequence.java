class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0
;        }
        int count=1;
        int max=1;
        for(int i=nums.length-1;i>0;i--){
            if((nums[i]-nums[i-1])==1){
                 count++;
                max=Math.max(count,max);
            }
            else if((nums[i]-nums[i-1])==0){
                continue;
            }
            else count=1;
        }
        return max;
    }
}