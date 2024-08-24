import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FairCandySwap {
  public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int sumA = Arrays.stream(aliceSizes).sum();
    int sumB = Arrays.stream(bobSizes).sum();
    int diff = (sumB - sumA) / 2;

    // Set to store Bob's candy box sizes
    Set<Integer> bobSet = new HashSet<>();
    for (int size : bobSizes) {
      bobSet.add(size);
    }

    for (int aliceSize : aliceSizes) {
      int requiredBobSize = aliceSize + diff;
      if (bobSet.contains(requiredBobSize)) {
        return new int[] { aliceSize, requiredBobSize };
      }
    }

    // Return empty array or handle no solution case
    return new int[0];
  }

  public static void main(String[] args) {
    int arr1[] = { 1 };
    int arr2[] = { 2, 3 };
    int ans[] = fairCandySwap(arr1, arr2);
    for (int i : ans)
      System.out.print(i + " ");
  }
}
