class Solution {
    public int minSteps(String s, String t) {
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(char ch:s.toCharArray()){
            count1[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            count2[ch-'a']++;
        }
        int step=0;
        for(int i=0;i<26;i++){
            step+=Math.abs(count1[i]-count2[i]);
        }
        return step/2;
    }
}