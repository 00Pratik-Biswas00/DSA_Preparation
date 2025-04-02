import java.util.Arrays;

public class Q1220CountVowelsPermutation {

    static int MOD = 1000000007;
    static int a = 0, e = 1, i = 2, o = 3, u = 4;
    static long[][] dp;

    public static int countVowelPermutation(int n) {
        dp = new long[6][n + 1];
        for (long[] row : dp)
            Arrays.fill(row, -1);

        long result = 0;
        result = (result + solve(a, n - 1)) % MOD;
        result = (result + solve(e, n - 1)) % MOD;
        result = (result + solve(i, n - 1)) % MOD;
        result = (result + solve(o, n - 1)) % MOD;
        result = (result + solve(u, n - 1)) % MOD;

        return (int) result;
    }

    private static long solve(int ch, int n) {
        if (n == 0)
            return 1;
        if (dp[ch][n] != -1)
            return dp[ch][n];
        if (ch == a)
            return dp[ch][n] = solve(e, n - 1) % MOD;
        else if (ch == e)
            return dp[ch][n] = (solve(a, n - 1) + solve(i, n - 1)) % MOD;

        else if (ch == i)
            return dp[ch][n] = (solve(a, n - 1) + solve(e, n - 1) + solve(o, n - 1) + solve(u, n - 1)) % MOD;

        else if (ch == o)
            return dp[ch][n] = (solve(i, n - 1) + solve(u, n - 1)) % MOD;

        else {
            return dp[ch][n] = solve(a, n - 1) % MOD;
        }

    }

    public static void main(String[] args) {
        System.out.println(countVowelPermutation(5));
    }
}
