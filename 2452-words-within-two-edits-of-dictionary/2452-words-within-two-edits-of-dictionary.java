class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
       ArrayList<String> list=new ArrayList<>();
        for(String i:queries){
        for(String j:dictionary){
            int diff=0;
            for(int k=0;k<j.length();k++){
                if(i.charAt(k)!=j.charAt(k))
                    diff++;
                if(diff>2)
                    break;
            }
            if(diff<=2){
                list.add(i);
                break;
            }
            
        }
      }
       return list;
    }
}