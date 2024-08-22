import java.util.ArrayList;
import java.util.List;

class LuckyNumber {
  public static List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> myMatrix = new ArrayList<>();
    int n = matrix.length;
    int m = matrix[0].length;
    for (int i = 0; i < n; i++) {
      // Find the minimum element in the current row
      int rowMin = Integer.MAX_VALUE;
      int rowMinIndex = -1;
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] < rowMin) {
          rowMin = matrix[i][j];
          rowMinIndex = j;
        }
      }

      // Check if the minimum element is the maximum in its column
      boolean isLucky = true;
      for (int k = 0; k < n; k++) {
        if (matrix[k][rowMinIndex] > rowMin) {
          isLucky = false;
          break;
        }
      }

      if (isLucky) {
        myMatrix.add(rowMin);
      }
    }
    return myMatrix;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };

    List<Integer> res = luckyNumbers(matrix);
    for (int i : res)
      System.out.print(i);

    System.out.println();
  }

}
