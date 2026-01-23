class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] nums=new int[2];
        int[] freq=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]>1) nums[0]=i;
        }
         for(int i=1;i<freq.length;i++){
            if(freq[i]==0) nums[1]=i;
        }
        return nums;
    }
}