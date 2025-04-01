import java.util.Arrays;

public class Q1155NumberOfDiceRollsWithTargetSum {
    static int MOD = 1000000007;
    static int[][] dp;

    public static int numRollsToTarget(int n, int k, int target) {
        dp = new int[n + 1][target + 1]; // Declare dp globally
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return helper(n, k, target);
    }

    private static int helper(int n, int k, int target) {
        if (target < 0)
            return 0; // If target is negative, it's not possible
        if (n == 0)
            return target == 0 ? 1 : 0; // Base case
        if (dp[n][target] != -1)
            return dp[n][target]; // Check memoized result

        long ways = 0;
        for (int face = 1; face <= k; face++) {
            ways = (ways + helper(n - 1, k, target - face)) % MOD;
        }

        return dp[n][target] = (int) ways;
    }

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(1, 6, 3));
    }
}
