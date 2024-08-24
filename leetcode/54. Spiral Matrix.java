import java.util.*;

class SpiralMatrix {

  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> myMatrix = new ArrayList<>();
    int n = matrix.length;
    int m = matrix[0].length;
    int left = 0, top = 0, right = m - 1, bottom = n - 1;

    while (top <= bottom && left <= right) {

      // right print
      for (int i = left; i <= right; i++) {
        myMatrix.add(matrix[top][i]);
      }
      top++;

      for (int i = top; i <= bottom; i++) {
        myMatrix.add(matrix[i][right]);
      }
      right--;

      if (top <= bottom) {

        for (int i = right; i >= left; i--) {
          myMatrix.add(matrix[bottom][i]);
        }
        bottom--;
      }

      if (left <= right) {

        for (int i = bottom; i >= top; i--) {
          myMatrix.add(matrix[i][left]);
        }
        left++;
      }
    }
    return myMatrix;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

    List<Integer> res = spiralOrder(matrix);
    for (int i : res)
      System.out.print(i);

    System.out.println();
  }

}