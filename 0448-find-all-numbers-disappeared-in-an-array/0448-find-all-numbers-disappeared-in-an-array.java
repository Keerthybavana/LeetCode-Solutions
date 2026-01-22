class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int[] temp=new int[nums.length];
        int i=0,j=nums.length-1;
        while(i<=j){
            temp[nums[i]-1]++;
            temp[nums[j]-1]++;
            i++;
            j--;
        }
        for(int k=0;k<temp.length;k++){
            if(temp[k]==0) arr.add(k+1);
        }
        return arr;
    }
}