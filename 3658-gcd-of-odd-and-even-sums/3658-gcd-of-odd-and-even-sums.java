class Solution {
    public int gcdOfOddEvenSums(int n) {
       int odd=n*n;
       int even=n*n+n;
       while(odd>0 && even>0){
         if(even>odd){
            even=even%odd;
         }
         else{
            odd=odd%even;
         }
       }
       if(even==0) return odd;
       return even;
    }
}