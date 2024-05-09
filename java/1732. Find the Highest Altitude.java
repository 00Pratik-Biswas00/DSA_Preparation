class LargestAlt {
  public static int largestAltitude(int[] gain) {
    int num[] = new int[gain.length + 1];
    num[0] = 0;
    int max = 0;
    for (int i = 1; i < gain.length; i++) {
      num[i] = gain[i - 1] + num[i - 1];
    }
    for (int i = 0; i < num.length; i++) {
      if (num[i] > max)
        max = num[i];
    }
    return max;
  }

  public static void main(String[] args) {
    int gain[] = { -4, -3, -2, -1, 4, 3, 2 };
    System.out.println(largestAltitude(gain));
  }
}
