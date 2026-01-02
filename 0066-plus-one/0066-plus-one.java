class Solution {
    public int[] plusOne(int[] digits) {
       int i=digits.length-1;
       digits[i]+=1;
       while(i>0 && digits[i]==10){
        digits[i]=0;
        i=i-1;
        digits[i]+=1;
       }
       while(digits[i]==10){
        int arr[]=new int[digits.length+1];
        arr[0]=1;
        return arr;
       }
       return digits;
    }
}