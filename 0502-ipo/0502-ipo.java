
class Solution {
    public int findMaximizedCapital(int k, int W, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];

        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        Arrays.sort(projects, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int abc = 0;

        for (int i = 0; i < k; i++) {
            while (abc < n && projects[abc][0] <= W) {
                maxHeap.offer(projects[abc][1]);
                abc++;
            }
            if (maxHeap.isEmpty()) break; 
            W += maxHeap.poll(); 
        }
        return W;
    }
}

