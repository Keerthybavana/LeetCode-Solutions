class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int i=0, j=k-1;
        int min=Integer.MAX_VALUE;
        while(j<nums.length){
            int diff=nums[j]-nums[i];
            min=Math.min(min,diff);
            j++;i++;
        }
        return min;
    }
}