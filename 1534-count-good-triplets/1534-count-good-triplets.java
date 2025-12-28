class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int aa=Math.abs(arr[i]-arr[j]);
                    int bb=Math.abs(arr[j]-arr[k]);
                    int cc=Math.abs(arr[i]-arr[k]);
                    if(aa<=a){
                        if(bb<=b){
                            if(cc<=c){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}