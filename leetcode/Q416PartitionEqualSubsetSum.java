public class Q416PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }
        if (totalSum % 2 != 0)
            return false;
        int target = totalSum / 2;
        boolean dp[] = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = dp.length - 1; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int a[] = { 1, 5, 11, 5 };
        System.out.println(canPartition(a));
    }
}
