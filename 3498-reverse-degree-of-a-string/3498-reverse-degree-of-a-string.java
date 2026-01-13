class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=0,j=s.length()-1;
        while(i<=j){
            sum+=('z'-s.charAt(i) +1)*(i+1);
            if(i!=j) sum+=('z'-s.charAt(j) +1)*(j+1);
            i++;j--;
        }
        return sum;
    }
}