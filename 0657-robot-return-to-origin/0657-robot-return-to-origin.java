class Solution {
    public boolean judgeCircle(String moves) {
       char[] ch=moves.toCharArray();
       int ucount=0;
       int dcount=0;
       int lcount=0;
       int rcount=0;
       for(int i=0;i<ch.length;i++){
         if(ch[i]=='U') ucount++;
         else if(ch[i]=='D') dcount++;
         else if(ch[i]=='L') lcount++;
         else if(ch[i]=='R') rcount++;
       }
       if(ucount==dcount && lcount==rcount) return true;
       return false;
    }
}