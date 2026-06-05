class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0, j=arr.length, m;
        while(i<j){
            m=(i+j)/2;
            if(arr[m]-1-m<k) i=m+1;
            else j=m;
        }
        return i+k;
    }
}