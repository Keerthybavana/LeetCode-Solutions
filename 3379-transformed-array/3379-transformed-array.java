class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            j=((i+nums[i])%nums.length+nums.length)%nums.length;
            res[i]=nums[j];
        }
        return res;
    }
}