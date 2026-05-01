class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count=0;
        int arr[]=new int[grid.length];
        int arr1[]=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            int maxCol=-1;
            int maxRow=-1;
            for(int j=0;j<grid.length;j++){
               maxCol=Math.max(maxCol,grid[j][i]);
               maxRow=Math.max(maxRow,grid[i][j]);
            }
            arr[i]=maxCol;
            arr1[i]=maxRow;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
               count+=((arr[j]>arr1[i])?arr1[i]:arr[j])-grid[i][j];
            }
        }
        return count;
    }
}