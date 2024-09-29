package others;

import java.util.HashSet;
import java.util.Scanner;

class RemoveDupliSorted {

  public void remove(int n, int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : arr) {
      set.add(i);
    }
    int i = 0;
    int k = set.size();
    for (int j : set) {
      arr[i++] = j;
    }

    for (int l = 0; l < k; l++) {
      System.out.println(arr[l] + " ");
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    RemoveDupliSorted tcs = new RemoveDupliSorted();

    tcs.remove(n, arr);

    sc.close();
  }
}
