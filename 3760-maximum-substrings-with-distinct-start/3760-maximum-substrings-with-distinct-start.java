class Solution {
    public int maxDistinct(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        int count=0;
        int i=0,j=s.length()-1;
        while(i<=j){
            if(!arr.contains(s.charAt(i)) && i!=j) {
                arr.add(s.charAt(i));
                count++;
            }if(!arr.contains(s.charAt(j))){
                arr.add(s.charAt(j));
                count++;
            }
            i++;j--;
        }
        return count;
    }
}