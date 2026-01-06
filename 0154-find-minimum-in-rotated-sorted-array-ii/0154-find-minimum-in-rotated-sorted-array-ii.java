class Solution {
    public int findMin(int[] arr) {
        int min=arr[0];
        int i=0,j=arr.length-1;
        
        while(i<=j){
            if(arr[i]<=arr[j] && arr[i]<min) min=arr[i];
            else if(arr[i]>=arr[j] && arr[j]<min) min=arr[j];
            i++;
            j--;
        }
        return min;
    }
}