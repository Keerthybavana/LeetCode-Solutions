class Solution {
    public String sortSentence(String s) {
       String[] res=s.split(" ");
       int i=0;
       while(i<res.length){
        int n=res[i].length();
        int j=res[i].charAt(n-1)-'0'-1;
         if(i!=j){
            String temp=res[i];
            res[i]=res[j];
            res[j]=temp;
         }
         else{
            i++;
         }
       }

       StringBuilder sb=new StringBuilder();
       for(int j=0;j<res.length;j++){
            sb.append(res[j],0,res[j].length()-1);
            if(j<res.length-1) sb.append(" ");
       }
       return sb.toString();
    }
}