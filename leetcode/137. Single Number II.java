import java.util.*;

class single_number {

  public static int singleNumber(int[] nums) {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    // setting the array elements and its counts in a map
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    // extract the key that has value 1
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() == 1) {
        count = e.getKey();
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 2, 2, 5, 5, 5, 4 };

    System.out.println(singleNumber(nums));
  }

}
