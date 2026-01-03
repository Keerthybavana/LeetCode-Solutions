class Solution {
    public int numOfWays(int n) {
        long mod = 1000000007;
        long abc = 6;
        long aba = 6;
        for (int i = 2; i <= n; i++) {
            long newABC = (2 * abc + 2 * aba) % mod;
            long newABA = (2 * abc + 3 * aba) % mod;

            abc = newABC;
            aba = newABA;
        }
        return (int)((abc + aba) % mod);
    }
}
