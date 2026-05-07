class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xCoordinates = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xCoordinates[i] = points[i][0];
        }
        Arrays.sort(xCoordinates);
        int maxGap = 0;
        for (int i = 0; i < xCoordinates.length - 1; i++) {
            int currentGap =xCoordinates[i + 1] - xCoordinates[i];
            maxGap = Math.max(maxGap, currentGap);
        }
        return maxGap;
    }
}