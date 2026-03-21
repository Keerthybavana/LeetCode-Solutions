class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int a=y+k-1;
        for(int i=y;i<=a;i++){
            for(int j=0;j<k/2;j++){
                int temp=grid[x+j][i];
                grid[x+j][i]=grid[x+k-j-1][i];
                grid[x+k-j-1][i]=temp;
            }
        }
        return grid;
    }
}