public class Q74SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return false;
        int m = 0;
        int n = matrix[0].length - 1;
        while (m <= matrix.length - 1 && n >= 0) {
            if (matrix[m][n] == target) {
                return true;
            } else if (matrix[m][n] < target) {
                m++;
            } else {
                n--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Q74SearchA2DMatrix obj = new Q74SearchA2DMatrix();
        int[][] mat = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        System.out.println(obj.searchMatrix(mat, 5));
    }
}
