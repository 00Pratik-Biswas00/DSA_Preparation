import java.util.*;

class Single_Number {

  public static int[] singleNumber(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    // setting the array elements and its counts in a map
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    List<Integer> keysList = new ArrayList<>();
    // extract the key that has value 1
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() == 1) {
        keysList.add(e.getKey());
      }
    }
    // Convert list to array (if needed)
    // Convert List<Integer> to int[] array
    int[] keysArray = new int[keysList.size()];
    for (int i = 0; i < keysList.size(); i++) {
      keysArray[i] = keysList.get(i);
    }

    return keysArray;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 1, 3, 2, 5 };

    int[] result = singleNumber(nums);

    // Print the elements of the result array
    for (int i = 0; i < result.length; i++)
      System.out.print(result[i] + " ");
  }

}
