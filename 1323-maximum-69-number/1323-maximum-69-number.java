class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                char[] ch = s.toCharArray();
                ch[i] = '9';
                s = new String(ch);
                break;
            }
        }
        return Integer.parseInt(s);
    }
}