import java.util.Arrays;
import java.util.Collections;

class rotateMatrix {

  public void rotate(int[][] matrix) {
    int n = matrix.length;
    // transpose
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // reverse
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        // Swap matrix[i][j] with matrix[i][n-1-j]
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = temp;
      }
    }
    // print
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    rotateMatrix rM = new rotateMatrix();
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    rM.rotate(matrix);
  }
}
