class SpiralMatrixIII {
  public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

    int directions[][] = {
        { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }
    };
    int n = rows * cols;
    int res[][] = new int[n][2];
    res[0][0] = rStart;
    res[0][1] = cStart;
    int count = 1, step = 1, index = 0;
    while (count < n) {
      for (int times = 0; times < 2; times++) {
        int dr = directions[index % 4][0];
        int dc = directions[index % 4][1];
        for (int i = 0; i < step; i++) {
          rStart += dr;
          cStart += dc;
          if (rStart >= 0 && cStart >= 0 && rStart < rows && cStart < cols) {
            res[count][0] = rStart;
            res[count][1] = cStart;
            count++;
          }
        }
        index++;

      }
      step++;
    }

    return res;
  }

  public static void main(String[] args) {
    int[][] res = spiralMatrixIII(5, 6, 1, 4);
    for (int[] row : res) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

  }
}
