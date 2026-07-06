class Solution {
    public void sortColors(int[] nums) {
        int zerocount=0;
        int onecount=0;
        int twocount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zerocount++;
            else if(nums[i]==1) onecount++;
            else if(nums[i]==2) twocount++;
        }
        int k=0;
        for(int i=0;i<zerocount;i++){
            nums[k]=0;k++;
        }
        for(int i=0;i<onecount;i++){
            nums[k]=1;k++;
        }
        for(int i=0;i<twocount;i++){
            nums[k]=2;k++;
        }
        
    }
}