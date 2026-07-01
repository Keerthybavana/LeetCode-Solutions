class Solution {
    public String convertToBase7(int n) {
        if(n == 0) return "0";        
        if(n < 0) return "-" + convertToBase7(-n); 
               
        String res="";
         while(n!=0){          
            int rem=n%7;
            res=rem+res; 
            n=n/7;   
        }        
        return res;
    }
}