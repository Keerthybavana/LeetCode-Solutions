/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long sum = 0;
    long ans = 0;
    int MOD = 1000000007;

    public int maxProduct(TreeNode root) {
        getSum(root);
        split(root);
        return (int)(ans % MOD);
    }

    void getSum(TreeNode node) {
        if (node == null) return;
        sum += node.val;
        getSum(node.left);
        getSum(node.right);
    }
    long split(TreeNode node) {
        if (node == null) return 0;

        long i = split(node.left);
        long j = split(node.right);
        long add = node.val + i + j;
        ans = Math.max(ans, add * (sum - add));
        return add;
    }
}
