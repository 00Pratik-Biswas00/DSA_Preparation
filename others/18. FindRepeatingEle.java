package others;

import java.util.HashMap;
import java.util.Scanner;

class FindRepeatingEle {
  public static void findRepeat(int n, int arr[]) {
    HashMap<Integer, Integer> elementCount = new HashMap<>();

    for (int i : arr) {
      if (elementCount.get(i) == null)
        elementCount.put(i, 1);
      else
        elementCount.put(i, elementCount.get(i) + 1);
    }
    System.out.print("The repeating elements are: ");
    for (HashMap.Entry<Integer, Integer> entry : elementCount.entrySet()) {
      if (entry.getValue() > 1)
        System.out.print(entry.getKey() + " ");
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n + 1];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    findRepeat(n, arr);

    sc.close();
  }
}
