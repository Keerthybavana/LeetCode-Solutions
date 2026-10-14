class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> kee=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<Math.min(k,nums1.length);i++){
            kee.offer(new int[] {nums1[i]+nums2[0], i,0});
        }
        while(k>0 && !kee.isEmpty()){
            int temp[]=kee.poll();
            int i=temp[1];
            int j=temp[2];
            list.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1<nums2.length){
                kee.offer(new int[]{nums1[i]+nums2[j+1], i ,j+1});
            }
            k--;
        }
        return list;
    }
}