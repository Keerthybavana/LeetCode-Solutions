class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int min=nums[0], max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i])  max=nums[i];
            if(min>nums[i]) min=nums[i];
            set.add(nums[i]);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}