class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            set.add(nums[i]);
        }

        int[] keer=new int[set.size()];
        int c=0;
        for(int num:set){
            keer[c++]=num;
        }
        int a=0;
        int arr[]=new int [k];     
    
        for(int j=0;j<k;j++){
            int max=Integer.MIN_VALUE;
            int key=0;
            for(int i=0;i<keer.length;i++){
                if(map.get(keer[i])>max){
                    key=keer[i];
                    max=map.get(keer[i]);
                }
            }
            arr[a++]=key;
            map.put(key,-1);
        }
        
        return arr;
    }
}














