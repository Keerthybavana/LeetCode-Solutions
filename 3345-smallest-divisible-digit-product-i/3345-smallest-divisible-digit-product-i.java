class Solution {
    public int smallestNumber(int n, int t) {
        boolean moh=false;
        while(!moh){
            if(pro(n,t)%t==0){
                return n;
            }
            n++;
        }
        return n;
    }
    public int pro(int n,int t){
        int p=1;
        while(n!=0){
            int rem=n%10;
            p*=rem;
            n/=10;
        }
        return p;
    }
}