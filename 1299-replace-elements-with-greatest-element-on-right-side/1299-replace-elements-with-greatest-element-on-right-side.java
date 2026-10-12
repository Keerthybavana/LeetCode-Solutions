class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int temp=arr[arr.length-1];
       for(int i=arr.length-1;i>=0;i--){
         if(i==arr.length-1){
            arr[i]=max;
         }
         else{           
            if(temp>=max){
                max=temp;
            }
            temp=arr[i];
            arr[i]=max;
         }
       }
        return arr;
    }
}