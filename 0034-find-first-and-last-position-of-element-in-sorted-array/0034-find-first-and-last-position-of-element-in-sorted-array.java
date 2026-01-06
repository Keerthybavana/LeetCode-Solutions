class Solution {
    public int[] searchRange(int[] arr, int x) {/*
        if(nums.length==1 && target==nums[0]) return new int[] {0,0};
        if(nums.length==0) return new int[] {-1,-1};
        int temp[]=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                temp[j]=i;
                j++; 
                if(i==nums.length-1|| (i<nums.length-1 && nums[i]!=nums[i+1])){
                 temp[1]=i;
                }          
                j=0;     
            }          
        }
        
        while(temp[0]==0 && temp[1]==0 && target!=nums[0] ){
            temp[0]=-1;
            temp[1]=-1;
        }       
        return temp;
        */
        int i=0,j=arr.length-1;
        int st=-1,lt=-1;
        int[] nums=new int[2];
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==x) {
                lt=mid;
                i=mid+1;
            }
            else if(arr[mid]<x) i=mid+1;
            else j=mid-1;
        }
        i=0;j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==x) {
                st=mid;
                j=mid-1;
            }
            else if(arr[mid]<x) i=mid+1;
            else j=mid-1;
        }
        nums[0]=st;
        nums[1]=lt;
        return nums;
    }
}