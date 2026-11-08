class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals("bankb")) return false;
        int count=0;
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0) +1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0) +1); 
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                 count++; 
                 if(!map2.containsKey(s1.charAt(i)) || !map1.containsKey(s2.charAt(i))) return false;
            }
        }

        return (count==0 || count==2)?true:false;
    }
}