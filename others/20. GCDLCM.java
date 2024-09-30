package others;

import java.util.Scanner;

class GCDLCM {
  public static int GCD(int m, int n) {

    while (m > 0 && n > 0) {
      if (m > n)
        m = m % n;
      else
        n = n % m;
    }

    if (m == 0)
      return n;
    else
      return m;

  }

  public static int LCM(int m, int n) {

    int r = GCD(m, n);
    return Math.abs(m * n) / r;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int r = GCD(m, n);
    int p = LCM(m, n);

    System.out.println(r + "  " + p);
    sc.close();
  }
}
