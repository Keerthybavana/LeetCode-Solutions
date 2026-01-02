class Solution {
    public int firstMissingPositive(int[] a) {
        for (int i = 0; i < a.length; i++)
            while (a[i] > 0 && a[i] <= a.length && a[a[i] - 1] != a[i])
                swap(a, i, a[i] - 1);

        for (int i = 0; i < a.length; i++)
            if (a[i] != i + 1) return i + 1;

        return a.length + 1;
    }

    void swap(int[] a, int i, int j) {
        int t = a[i];
         a[i] = a[j];
          a[j] = t;
    }
}
