class Solution {
    public int maxScore(int[] c, int k) {
        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += c[i];
        }
        int ans = leftSum;
        int rightSum = 0;
        for (int i = k - 1, j = c.length - 1; i >= 0; i--, j--) {
            leftSum -= c[i];
            rightSum += c[j];
            ans = Math.max(ans, leftSum + rightSum);
        }
        return ans;
    }
}