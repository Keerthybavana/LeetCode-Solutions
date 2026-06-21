class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0, count=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            sum+=costs[i];
            count++;
            if(sum>coins){
                sum-=costs[i];
                count--;
            }
        }
        return count;
    }
}