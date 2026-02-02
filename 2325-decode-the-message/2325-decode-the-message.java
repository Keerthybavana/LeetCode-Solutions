class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb=new StringBuilder();
        key = key.replaceAll(" ","");
        HashMap<Character,Character> res=new HashMap<>();
        char og='a';
        for(int i=0;i<key.length();i++){
            if(!res.containsKey(key.charAt(i))){
                res.put(key.charAt(i),og++);
            }
        }
        for(int i=0;i<message.length();i++){
            if(res.containsKey(message.charAt(i))){
                sb.append(res.get(message.charAt(i)));
            }
            else {
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
}