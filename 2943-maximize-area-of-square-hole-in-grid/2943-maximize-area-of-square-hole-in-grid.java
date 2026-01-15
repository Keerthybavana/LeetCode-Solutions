class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        n=1;int maxh=1;
        m=1;int maxv=1;
        for(int i=1;i<hBars.length;i++){
            if(hBars[i]==hBars[i-1]+1) n++;
            else n=1;
            maxh=Math.max(maxh,n);
        }
        for(int i=1;i<vBars.length;i++){
            if(vBars[i]==vBars[i-1]+1) m++;
            else m=1;
            maxv=Math.max(maxv,m);
        }
        int min=Math.min(maxh+1,maxv+1);
        return min*min;
    }
}