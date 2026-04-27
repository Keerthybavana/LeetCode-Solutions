class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = groupSizes.length;
        for(int i = 0; i < n; i++){
            int size = groupSizes[i];

            List<Integer> list = map.getOrDefault(size, new ArrayList<>());
            list.add(i);
            map.put(size, list);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int key : map.keySet()){
            List<Integer> groupSizeArray = map.get(key);
            int groupLength = key;
            int totalGroups =  groupSizeArray.size() / groupLength; 
            for(int i = 0; i < totalGroups; i++){
                List<Integer> list = new ArrayList<>(); 
                for(int j = 0; j < groupLength; j++){
                    list.add(groupSizeArray.get(i*groupLength + j));
                }
                res.add(list); 
            }

        }
        return res;
    }
}