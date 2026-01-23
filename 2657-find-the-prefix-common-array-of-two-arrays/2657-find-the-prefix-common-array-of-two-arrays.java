class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr=new int[A.length];
        HashSet<Integer> nums=new HashSet<>();
        for(int i=0;i<A.length;i++){
            int count=0;
            nums.add(A[i]);
            for(int j=0;j<=i;j++){
                if(nums.contains(B[j])) count++;
            }
            arr[i]=count;
        }
        return arr;
    }
}