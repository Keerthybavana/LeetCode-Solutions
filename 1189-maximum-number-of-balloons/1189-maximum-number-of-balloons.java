class Solution {
    public int maxNumberOfBalloons(String text) {
       int b=0, a=0, l=0, o=0, n=0;
       for(int i=0;i<text.length();i++){
         if(text.charAt(i)=='b') b++;
         else if(text.charAt(i)=='a') a++;
         else if(text.charAt(i)=='l') l++;
         else if(text.charAt(i)=='o') o++;
         else if(text.charAt(i)=='n') n++;
       }
       int min = b;
        min = Math.min(min, a);
        min = Math.min(min, l/2);
        min = Math.min(min, o/2);
        min = Math.min(min, n);
        return min;
    }
}