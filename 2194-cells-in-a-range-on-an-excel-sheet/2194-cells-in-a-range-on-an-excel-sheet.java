class Solution {
    public List<String> cellsInRange(String s) {
        char col1=s.charAt(0), col2=s.charAt(3);
        char row1=s.charAt(1), row2=s.charAt(4);
        List<String> cell=new ArrayList<>();
        for(char i=col1;i<=col2;++i){
            for(char j=row1;j<=row2;++j){
                cell.add(""+i+j);
            }
        }
        return cell;
    }
}