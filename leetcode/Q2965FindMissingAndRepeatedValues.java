public class Q2965FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[2];
        int arr2[] = new int[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[grid[i][j]]++;

            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (arr2[i] == 2) {
                arr[0] = i;
            } else if (arr2[i] == 0) {
                arr[1] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Q2965FindMissingAndRepeatedValues obj = new Q2965FindMissingAndRepeatedValues();
        int[][] grid = { { 1, 3 }, { 2, 2 } };
        int arr[] = obj.findMissingAndRepeatedValues(grid);
        for (Integer a : arr)
            System.out.println(a);
    }
}
