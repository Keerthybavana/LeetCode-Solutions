class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] temp=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map=new HashMap<>();
        int k=1;
        for(int i=0;i<temp.length;i++){
            if(!map.containsKey(temp[i])) 
             map.put(temp[i],k++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}