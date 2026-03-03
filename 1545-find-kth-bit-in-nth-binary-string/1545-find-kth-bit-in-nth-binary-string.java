class Solution {
    public char findKthBit(int n, int k) {
        boolean flag=false;
        while(n>1){
            int mid=1<<(n-1);
            int len=(1<<n)-1;
            if(k==mid) {
                return flag?'0':'1';
            }
            if(k>mid){
                k=len-k+1;
                flag=!flag;
            }
            n--;
        }
         return flag?'1':'0';
    }
}