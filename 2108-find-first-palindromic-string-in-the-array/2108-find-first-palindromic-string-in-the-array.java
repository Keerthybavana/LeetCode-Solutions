class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for(int k=0;k<words.length;k++){
            int i=0,j=words[k].length()-1;
            boolean palin=true;
            while(i<j){
                if(words[k].charAt(i)!=words[k].charAt(j)) {
                    palin=false;
                    break;
                }               
                i++;j--;
            }
            if(palin) return words[k];
        }
        return "";
    }
}