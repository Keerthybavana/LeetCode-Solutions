class Solution {
    public int minPairSum(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[] freq = new int[100001];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
            freq[nums[i]]++;
        }
        int maxi= 0, lt = min, rt = max;
        while(lt <= rt) {
            if(freq[lt] == 0) lt++;
            else if(freq[rt] == 0) rt--;
            else {
                maxi = Math.max(maxi, lt + rt);
                freq[lt]--;
                freq[rt]--;
            }
        }
        return maxi;
    }
}