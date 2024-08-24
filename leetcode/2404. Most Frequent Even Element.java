import java.util.HashMap;
import java.util.Map;

class MostFreqEvenElement {

  public static int mostFrequentEven(int[] nums) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    // Count the frequency of each even element
    for (int num : nums) {
      if (num % 2 == 0) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
      }
    }

    // Find the most frequent even element
    int mostFrequentEven = -1;
    int maxFrequency = 0;
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      int num = entry.getKey();
      int frequency = entry.getValue();
      if (frequency > maxFrequency || (frequency == maxFrequency && num < mostFrequentEven)) {
        mostFrequentEven = num;
        maxFrequency = frequency;
      }
    }

    return mostFrequentEven;
  }

  public static void main(String[] args) {
    // Test cases
    int[] nums1 = { 0, 1, 2, 2, 4, 4, 1 };
    System.out.println(mostFrequentEven(nums1)); // Output: 2

    int[] nums2 = { 4, 4, 4, 9, 2, 4 };
    System.out.println(mostFrequentEven(nums2)); // Output: 4

    int[] nums3 = { 29, 47, 21, 41, 13, 37, 25, 7 };
    System.out.println(mostFrequentEven(nums3)); // Output: -1
  }
}
