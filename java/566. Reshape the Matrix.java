class ReshapeMatrix {
  public static int[][] matrixReshape(int[][] mat, int r, int c) {
    int r1 = mat.length;
    int c1 = mat[0].length;
    if ((r * c) != (r1 * c1))
      return mat;
    int[][] ans = new int[r][c];
    int a = 0, b = 0;
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        ans[a][b] = mat[i][j];
        b++;

        if (b == c) {
          b = 0;
          a++;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[][] mat = { { 1, 2 }, { 3, 4 } };
    int[][] res = matrixReshape(mat, 1, 4);
    for (int[] row : res) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

  }
}
