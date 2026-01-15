class Solution {
    public int dayOfYear(String date) {
        int a=Integer.parseInt(date.substring(0,4));
        int b=Integer.parseInt(date.substring(5,7));
        int c=Integer.parseInt(date.substring(8,10));
        boolean leap=false;
        if(a%400==0 || (a%4==0 && a%100!=0)) leap=true;
        int day=0;
        for(int i=1;i<=b-1;i++){
            if(i==2){
                if(leap) day+=29;
                else day+=28;
            } 
            else if((i<=7 && i%2!=0) || (i>7 && i%2==0)) day+=31;
            else day+=30;
        }
        return day+c;
    }
}