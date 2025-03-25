public class Q240SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Q240SearchA2DMatrixII obj = new Q240SearchA2DMatrixII();
        int[][] mat = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(obj.searchMatrix(mat, 13));
    }
}
