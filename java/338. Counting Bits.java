class CountingBits {
  public static int[] countBits(int n) {
    int res[] = new int[n + 1];
    for (int i = 0; i <= n; i++)
    // res[i] = rec(i);
    {
      if (i % 2 == 0)
        res[i] = res[i / 2];
      else
        res[i] = res[i / 2] + 1;
    }
    return res;
  }

  // private static int rec(int n) {
  // if (n == 0)
  // return 0;
  // if (n == 1)
  // return 1;

  // if (n % 2 == 0)
  // return rec(n / 2);
  // else
  // return rec(n / 2) + 1;
  // }

  public static void main(String[] args) {
    int n = 2;
    int res[] = countBits(n);
    for (int i : res)
      System.out.println(i);
  }
}
