class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        int i=0,j=nums.length;
        while(i<nums.length && j<ans.length){
            ans[i]=nums[i];
            ans[j]=nums[i];
            i++;
            j++;
        }
        return ans;
    }
}