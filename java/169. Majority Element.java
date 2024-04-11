// import java.util.*;

class majorityElement {

  // Hashing approach
  // public static int majority_element(int[] nums) {
  // int n = nums.length;
  // int ans = 0;
  // HashMap<Integer, Integer> elementCountMap = new HashMap<>();
  // for (int element : nums) {
  // if (elementCountMap.containsKey(element)) {
  // elementCountMap.put(element, elementCountMap.get(element) + 1);
  // } else {
  // elementCountMap.put(element, 1);
  // }
  // }

  // for (Map.Entry<Integer, Integer> element : elementCountMap.entrySet()) {
  // if (element.getValue() > n / 2) {
  // ans = element.getKey();
  // }

  // }
  // return ans;
  // }

  // Moore's voting approach
  public static int majorityElement(int[] nums) {
    int count = 0;
    int element = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        count = 1;
        element = nums[i];
      } else if (nums[i] == element) {
        count++;
      } else {
        count--;
      }
    }
    int c1 = 0;
    for (int i = 0; i < nums.length; i++)
      if (nums[i] == element)
        c1++;

    if (c1 > nums.length / 2)
      return element;
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println(majorityElement(arr));
  }

}
