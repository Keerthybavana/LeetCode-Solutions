class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0, pre=0;
        for(String row: bank){
            int d=0;
            for(int j=0;j<bank[0].length();j++){
                d+=(row.charAt(j)=='1' ? 1:0);
            }
            if(d>0){
                ans+=d*pre;
                pre=d;
            }
        }
        return ans;
    }
}