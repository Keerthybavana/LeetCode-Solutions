class Solution {
    static class Event {
        long yCoord;
        int type;
        long leftX, rightX;

        Event(long yCoord, int type, long leftX, long rightX) {
            this.yCoord = yCoord;
            this.type = type;
            this.leftX = leftX;
            this.rightX = rightX;
        }
    }

    static class Slice {
        long baseY, sliceHeight, sliceWidth;

        Slice(long baseY, long sliceHeight, long sliceWidth) {
            this.baseY = baseY;
            this.sliceHeight = sliceHeight;
            this.sliceWidth = sliceWidth;
        }
    }

    private long unionWidth(ArrayList<long[]> segments) {
        segments.sort((a, b) -> {
            if (a[0] != b[0]) return Long.compare(a[0], b[0]);
            return Long.compare(a[1], b[1]);
        });

        long totalWidth = 0;
        long maxRight = (long) -1e18;

        for (long[] seg : segments) {
            long start = seg[0], end = seg[1];
            if (start > maxRight) {
                totalWidth += end - start;
                maxRight = end;
            } else if (end > maxRight) {
                totalWidth += end - maxRight;
                maxRight = end;
            }
        }
        return totalWidth;
    }

    public double separateSquares(int[][] squares) {
        ArrayList<Event> sweepEvents = new ArrayList<>();

        for (int[] square : squares) {
            long baseX = square[0], baseY = square[1], side = square[2];
            sweepEvents.add(new Event(baseY, 1, baseX, baseX + side));
            sweepEvents.add(new Event(baseY + side, -1, baseX, baseX + side));
        }

        sweepEvents.sort((a, b) -> {
            if (a.yCoord != b.yCoord) return Long.compare(a.yCoord, b.yCoord);
            if (a.type != b.type) return Integer.compare(a.type, b.type);
            if (a.leftX != b.leftX) return Long.compare(a.leftX, b.leftX);
            return Long.compare(a.rightX, b.rightX);
        });

        ArrayList<long[]> activeSegments = new ArrayList<>();
        long lastY = sweepEvents.get(0).yCoord;
        long fullArea = 0;
        ArrayList<Slice> slices = new ArrayList<>();

        for (Event ev : sweepEvents) {
            long currY = ev.yCoord;
            int currType = ev.type;
            long segLeft = ev.leftX;
            long segRight = ev.rightX;

            if (currY > lastY && !activeSegments.isEmpty()) {
                long deltaY = currY - lastY;

                ArrayList<long[]> temp = new ArrayList<>(activeSegments.size());
                for (long[] seg : activeSegments)
                    temp.add(new long[]{seg[0], seg[1]});

                long mergedWidth = unionWidth(temp);
                slices.add(new Slice(lastY, deltaY, mergedWidth));
                fullArea += deltaY * mergedWidth;
            }

            if (currType == 1) {
                activeSegments.add(new long[]{segLeft, segRight});
            } else {
                for (int i = 0; i < activeSegments.size(); i++) {
                    long[] seg = activeSegments.get(i);
                    if (seg[0] == segLeft && seg[1] == segRight) {
                        activeSegments.remove(i);
                        break;
                    }
                }
            }

            lastY = currY;
        }

        double target = fullArea / 2.0;
        double areaSoFar = 0.0;

        for (Slice sl : slices) {
            long yStart = sl.baseY;
            long h = sl.sliceHeight;
            long w = sl.sliceWidth;

            double sliceArea = (double) h * (double) w;
            if (areaSoFar + sliceArea >= target) {
                return (double) yStart + (target - areaSoFar) / (double) w;
            }
            areaSoFar += sliceArea;
        }

        return (double) lastY;
    }
}
