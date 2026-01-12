class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for(int i=0;i<points.length-1;i++){
            int j=0;
            int x=Math.abs(points[i+1][j]-points[i][j]);
            int y=Math.abs(points[i+1][j+1]-points[i][j+1]);
            sum+=Math.max(x,y);           
        }
        return sum;
    }
}