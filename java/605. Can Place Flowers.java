class CanPlaceFlowers {
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;
    int i = 0;
    while (i < flowerbed.length) {
      if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
          && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
        flowerbed[i] = 1; // plant a flower
        count++; // increment count of planted flowers
      }
      i++;
    }
    return count >= n; // return true if we can plant n flowers, otherwise false
  }

  public static void main(String[] args) {
    int flowerbed[] = { 1, 0, 1, 0, 1, 0, 1 };
    System.out.println(canPlaceFlowers(flowerbed, 1));
  }
}
