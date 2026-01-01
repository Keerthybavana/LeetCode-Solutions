class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int[] ugly={2,3,5};
        for(int i=0;i<ugly.length;i++){
            while(n%ugly[i]==0){
                n/=ugly[i];
            }
        }
        return n==1;
    }
}