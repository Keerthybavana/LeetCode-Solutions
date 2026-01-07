class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> arr=new ArrayList<>();
        int[] nums=intervals[0];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=nums[1]){
                nums[1]=Math.max(intervals[i][1],nums[1]);
            }
            else{
                arr.add(nums);
                nums=intervals[i];
            }
        }
        arr.add(nums);
        return arr.toArray(new int[arr.size()][]);

    }
}