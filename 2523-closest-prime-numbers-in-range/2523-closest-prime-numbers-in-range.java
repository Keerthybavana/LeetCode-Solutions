class Solution {
    public int[] closestPrimes(int left, int right) {
        int count=0;
        boolean[] prime=new boolean[right+1];
        Arrays.fill(prime,true);
        if(right>=0) prime[0]=false;
        if(right>=1) prime[1]=false;
        for(int i=2;i*i<=right;i++){
            if(prime[i]){
                for(int j=i*i;j<=right;j+=i){
                    prime[j]=false;
                }
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime[i]){
               arr.add(i);
            }
        }
        int minDiff = Integer.MAX_VALUE;
        int num1 = -1, num2 = -1;

        for (int i = 1; i < arr.size(); i++) {
        int diff = arr.get(i) - arr.get(i - 1);
        if (diff < minDiff) {
        minDiff = diff;
        num1 = arr.get(i - 1);
        num2 = arr.get(i);
        }
    }                       
        return new int[]{num1,num2};
    }
}