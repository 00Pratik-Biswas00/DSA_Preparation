public class MaxValOfEquation {
  public static int findMaxValueOfEquation(int[][] points, int k) {
    int x = Integer.MIN_VALUE;
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        if (Math.abs(points[i][0] - points[j][0]) <= k) {
          int equationValue = points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0]);
          x = Math.max(x, equationValue);
        }
      }
    }
    return x;
  }

  public static void main(String[] args) {
    int[][] points = { { 1, 3 }, { 2, 0 }, { 5, 10 }, { 6, -10 } };
    System.out.println(findMaxValueOfEquation(points, 1));
  }
}
