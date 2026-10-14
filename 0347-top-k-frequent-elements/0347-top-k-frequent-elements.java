class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> kee=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            kee.offer(new int[] {entry.getKey(), entry.getValue()});
            if(kee.size()>k){
                kee.poll();
            }
        }
        int arr[]=new int[kee.size()];
        int i=0;
        while(!kee.isEmpty()){
            int temp[]=kee.poll();
            arr[i++]=temp[0];
        }
        return arr;
    }
}