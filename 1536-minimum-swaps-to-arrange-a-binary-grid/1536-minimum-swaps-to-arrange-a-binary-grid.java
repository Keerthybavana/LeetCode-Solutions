class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0) count++;
                else break;
            }
            arr[i]=count;
        }
        int swap=0;
        for(int i=0;i<n;i++){
            int nd=n-1-i;
            int f=-1;
            for(int j=i;j<n;j++){
                if(arr[j]>=nd){
                    f=j;
                    break;
                }
            }
            if(f==-1) return -1;
            for(int j=f;j>i;j--){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swap++;
            }
        }
        return swap;
    }
}