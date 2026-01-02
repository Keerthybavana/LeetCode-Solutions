class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] a=new int[n+2];
        a[0]=a[n+1]=1;
        for(int i=0;i<n;i++) a[i+1]=nums[i];

        int[][] arr=new int[n+2][n+2];

        for(int len=2;len<n+2;len++){
            for(int l=0;l+len<n+2;l++){
                int r=l+len;
                for(int k=l+1;k<r;k++){
                    arr[l][r]=Math.max(arr[l][r],
                        a[l]*a[k]*a[r]+arr[l][k]+arr[k][r]);
                }
            }
        }
        return arr[0][n+1];
    }
}
