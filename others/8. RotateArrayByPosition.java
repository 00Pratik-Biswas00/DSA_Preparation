package others;

import java.util.*;

class hello {
  public static void reverse(int arr[], int start, int end) {
    while (start < end) {
      int t = arr[start];
      arr[start] = arr[end];
      arr[end] = t;
      start++;
      end--;
    }
  }

  public void Rotate(int arr[], int k) {
    int n = arr.length;
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
    reverse(arr, 0, n - 1);

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    hello h = new hello();
    h.Rotate(arr, k);
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}
