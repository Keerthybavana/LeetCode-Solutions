class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        boolean[] boo=new boolean[26];
        Stack<Character> stack=new Stack<>();

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s.toCharArray()){
            freq[ch-'a']--;
            if(boo[ch-'a']) continue;
            while(!stack.isEmpty() && stack.peek()>ch && freq[stack.peek()-'a'] > 0){
                boo[stack.pop()-'a']=false;
            }
            stack.push(ch);
            boo[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}