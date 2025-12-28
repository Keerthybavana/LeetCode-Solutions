class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int i=grid.length-1,n=grid[0].length,j=0;
        while(i>=0 && j<n){
            if(grid[i][j]<0){
                count+=n-j;
                i--;
            }
            else j++;
        }
        return count;
    }
}