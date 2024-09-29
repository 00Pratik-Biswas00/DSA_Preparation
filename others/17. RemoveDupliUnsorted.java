package others;

import java.util.*;

class RemoveDupliUnsorted {

  public void remove(int n, int arr[]) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < n; i++) {
      if (!mp.containsKey(arr[i])) {
        System.out.println(arr[i] + " ");
        mp.put(arr[i], 1);
      }
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    RemoveDupliUnsorted tcs = new RemoveDupliUnsorted();

    tcs.remove(n, arr);

    sc.close();
  }
}
