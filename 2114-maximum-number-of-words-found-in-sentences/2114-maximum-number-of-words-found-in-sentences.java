class Solution {
    public int mostWordsFound(String[] sen) {
        int count=0;
        for(int i=0;i<sen.length;i++){
            int max=1;
            String ch=sen[i];

            for(int j=0;j<ch.length();j++){
                if(ch.charAt(j)==' '){
                max++;
                }                
            } 
            if(max>count){
                count=max;
            }
            
        }
        return count;
    }
}