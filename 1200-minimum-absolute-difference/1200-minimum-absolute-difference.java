class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> num=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
            if(min>diff) min=diff;
        }
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])==min){
                num.add(Arrays.asList(arr[i-1], arr[i]));             
            }
        }
        return num;
    }
}