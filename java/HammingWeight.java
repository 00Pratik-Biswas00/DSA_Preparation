import java.util.*;

class HammingWeight {
  public static int hammingWeight(int n) {
    List<Integer> arr = new ArrayList<>();
    // Size of an integer is assumed to be 32 bits
    for (int i = 31; i >= 0; i--) {
      int k = n >> i;
      if ((k & 1) > 0)
        arr.add(1);
      else
        arr.add(0);
    }
    int c = 0;
    for (int i : arr)
      if (i == 1)
        c++;

    return c;
  }

  public static void main(String[] args) {
    int nums = 2147483645;
    System.out.println(hammingWeight(nums));
  }
}
