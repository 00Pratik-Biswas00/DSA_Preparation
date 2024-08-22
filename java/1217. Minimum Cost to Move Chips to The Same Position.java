class MoveChips {
  public static int minCostToMoveChips(int[] position) {
    int even = 0, odd = 0;
    for (int i : position) {
      if (i % 2 == 0)
        even++;
      else
        odd++;
    }

    return Math.min(even, odd);
  }

  public static void main(String[] args) {
    int[] points = { 1, 2, 3 };
    System.out.println(minCostToMoveChips(points));
  }
}
