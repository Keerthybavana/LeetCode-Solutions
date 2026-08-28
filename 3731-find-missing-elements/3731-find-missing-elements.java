class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0], min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min=nums[i];
        }
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
        for(int i=min;i<=max;i++)
            if(!set.contains(i)) list.add(i);
        return list;
    }
}