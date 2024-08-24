class RichestCustomer {
  public static int maximumWealth(int[][] accounts) {
    int maxW = Integer.MIN_VALUE;

    for (int row = 0; row < accounts.length; row++) {
      int currentWealth = 0;
      for (int col = 0; col < accounts[row].length; col++) {
        currentWealth += accounts[row][col];
      }
      maxW = Math.max(maxW, currentWealth);
    }

    return maxW;
  }

  public static void main(String[] args) {
    int[][] points = { { 1, 5 }, { 3, 5 }, { 7, 3 }, };
    System.out.println(maximumWealth(points));
  }
}
