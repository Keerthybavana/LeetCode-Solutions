class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        /*
        int i=0, j=nums.length-1;
        while(i<j){
            if((nums[i]%2==0 && i%2!=0) && (nums[i]%2!=0 && i%2==0)){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j--;
            }
            else if((nums[i]%2==0 && i%2==0) || (nums[i]%2!=0 && i%2!=0)) {
                i++;
                j--;
            }
            else if((nums[j]%2==0 && j%2==0) || (nums[j]%2!=0 && j%2!=0)){
                j--;i++;
            }
        }*/

        int even[]=new int[nums.length/2];
        int odd[]=new int[nums.length/2];
        int k=0, b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) even[k++]=nums[i];
            if(nums[i]%2!=0) odd[b++]=nums[i];
            
        }

        int i=0, j=nums.length-1;
        while(i<j){
            if(i%2==0) nums[i]=even[i];
            else nums[i]=odd[i];

            if(j%2==0) nums[j]=even[i];
            else nums[j]=odd[i];
            i++;j--;
        }
        return nums;
    }
}