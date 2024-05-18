class CountNegNumbersSortedMatrix {
  public static int countNegatives(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int row = m - 1, col = 0, result = 0;
    while (row >= 0 && col < n) {
      if (grid[row][col] >= 0)
        col++;
      else {
        result += (n - col);
        row--;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
    System.out.println(countNegatives(matrix));
  }
}
