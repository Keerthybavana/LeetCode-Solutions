class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++){
            boolean s=convert(n,i);
            if(!s) return false;
        }
         return true;
    }
     boolean convert(int n,int i){
            if(n==0) return true;
            StringBuilder sb=new StringBuilder();
            while(n>0){
                sb.append(n%i);
                n/=i;
            }
            if(sb.toString().equals(sb.reverse().toString())) return true;
            return false;
        }
}