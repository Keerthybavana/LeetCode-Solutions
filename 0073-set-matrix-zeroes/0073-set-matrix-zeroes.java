class Solution {
    public void setZeroes(int[][] matrix) {
        int a=matrix.length,b=matrix[0].length;
        boolean row=false, col=false;

        for(int i=0;i<b;i++){
            if(matrix[0][i]==0) row=true;
        }
        for(int i=0;i<a;i++){
            if(matrix[i][0]==0) col=true;
        }

        for(int i=1;i<a;i++){
            for(int j=1;j<b;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<a;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<b;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=1;j<b;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<a;i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(row){
            for(int j=0;j<b;j++){
                matrix[0][j]=0;
            }
        }
        if(col){
            for(int i=0;i<a;i++){
                matrix[i][0]=0;
            }
        }
    }
}