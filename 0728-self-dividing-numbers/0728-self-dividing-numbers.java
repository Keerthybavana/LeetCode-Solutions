class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int temp = i;
            boolean flag = true;
            while(temp != 0){
                int rem = temp % 10;
                temp /= 10;

                if(rem == 0){
                    flag = false;
                    break;
                }

                if(i % rem != 0){
                    flag = false;
                    break;
                }
            }
            if(flag) res.add(i);  // must be OUTSIDE while loop
        }

        return res;
    }
}
