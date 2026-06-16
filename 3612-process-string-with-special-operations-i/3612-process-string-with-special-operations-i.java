class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]== '#'){
                sb.append(sb);
            }else if(ch[i]=='%'){
                sb.reverse();
            }else if(ch[i]== '*'){
                if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
            }else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}