package others;

import java.util.Scanner;
import java.util.Arrays;

class Median {

  public static void median(int n, int arr[]) {
    Arrays.sort(arr);
    if (n % 2 != 0) {
      System.out.println(arr[n / 2]);
    } else {
      int a = n / 2 - 1;
      int b = (n / 2);

      double ans = (double) ((arr[a] + arr[b])) / 2;
      System.out.println(ans);
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    median(n, arr);

    sc.close();
  }
}
