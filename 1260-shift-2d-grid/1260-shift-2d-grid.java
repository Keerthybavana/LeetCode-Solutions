class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int arr[][]=new int[n][m];
        List<List<Integer>> l=new ArrayList<>();

        if(n!=1 || m!=1){
        for(int a=0;a<k;a++){
            for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                if(i==n-1 && j==m-1){
                    arr[0][0]=grid[i][j];
                }
                else if(j==m-1){
                    arr[i+1][0]=grid[i][j];
                }
                else {
                    arr[i][j+1]=grid[i][j];
                }
             }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    grid[i][j]=arr[i][j];
                }
            }
        }
        }
        else{
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=grid[i][j];
            }
           }
        }  


        for(int i=0;i<n;i++){
                List<Integer> list=new ArrayList<>();
                for(int j=0;j<m;j++){
                    list.add(arr[i][j]);
                }
                l.add(list);
        }
        return l;     
    }
}