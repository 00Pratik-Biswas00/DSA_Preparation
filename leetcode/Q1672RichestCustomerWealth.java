public class Q1672RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int cols = accounts[0].length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += accounts[i][j];
            }
            if (sum >= ans) {
                ans = sum;
                sum = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q1672RichestCustomerWealth obj = new Q1672RichestCustomerWealth();
        int nums[][] = { { 1, 2, 3 }, { 4, 6, 1 } };
        System.out.print(obj.maximumWealth(nums));

    }
}
