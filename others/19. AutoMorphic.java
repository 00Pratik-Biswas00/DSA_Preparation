package others;

import java.util.*;

class AutoMorphic {

  public static boolean Replace(int n) {
    int mul = n * n;
    while (n > 0) {
      if (mul % 10 != n % 10)
        return false;

      n = n / 10;
      mul /= 10;

    }

    return true;

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean r = Replace(n);
    if (r)
      System.out.println("Automorphic");
    else
      System.out.println("Non-Automorphic");

    sc.close();
  }
}
