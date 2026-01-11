class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]", "");
        String b=a.toLowerCase();
        String rev="";
        for(int i=b.length()-1;i>=0;i--){
            rev+=b.charAt(i);
        }
        if(b.equals(rev)) return true;
        return false;
    }
}