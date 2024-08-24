import java.util.*;

class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int j = 0; j < nums.length; j++) {
      int complement = target - nums[j];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), j };
      }
      map.put(nums[j], j);
    }
    return new int[0];
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int t = 9;

    // Print the elements of the result array
    int[] result1 = twoSum(nums, t);
    System.out.println(Arrays.toString(result1));

  }
}
