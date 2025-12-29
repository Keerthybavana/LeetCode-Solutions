class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i<nums1.length){
                arr[i]=nums1[i];
            }
            else {
                arr[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(arr);
        int k=arr.length/2;
        if(arr.length%2==0)
        {
            return (double)(arr[k]+arr[k-1])/2;
        }
        
        return arr[k];
        
    }
}