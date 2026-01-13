class Solution {
    public String convertDateToBinary(String date) {
        int[] arr=new int[3];
        String[] str=date.split("-");
        StringBuilder s=new StringBuilder();

        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
            s.append(Integer.toBinaryString(arr[i]));
            if(i<str.length-1){
                s.append("-");
            }
        }
        return s.toString();
    }
}