package others;

// Print elements which have appeared even number of times
import java.util.*;

public class ArrayEven {
  public void tuki(int n, int arr[]) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < n; i++) {
      if (!mp.containsKey(arr[i])) {
        mp.put(arr[i], 1);
      } else {
        mp.put(arr[i], mp.get(arr[i]) + 1);
      }
    }

    for (HashMap.Entry<Integer, Integer> e : mp.entrySet()) {
      if (e.getValue() % 2 == 0) {
        System.out.println(e.getKey());
      }
    }
  }

  public static void main(String args[]) {
    ArrayEven t = new ArrayEven();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("array elements ");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    t.tuki(n, arr);
    sc.close();
  }
}
