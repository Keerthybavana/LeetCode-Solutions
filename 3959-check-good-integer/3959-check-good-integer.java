class Solution {
    public boolean checkGoodInteger(int n) {
        int sq=0;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            sq+=(int)Math.pow(rem,2);
            n/=10;
        }
        if((sq-sum)>=50){
            return true;
        }
        return false;
    }
}