class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        double res=Math.sqrt(sum);

        if(res-Math.ceil(res)==0) return (int) res;
        else return -1;
    }
}