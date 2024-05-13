import java.util.*;

class UniqueNumberofOccurrences {
  public static boolean uniqueOccurrences(int[] arr) {
    // Map to count occurrences of each value
    Map<Integer, Integer> countMap = new HashMap<>();
    for (int num : arr) {
      countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    // Set to store unique occurrences
    Set<Integer> occurrenceSet = new HashSet<>();
    for (int count : countMap.values()) {
      if (!occurrenceSet.add(count)) {
        // If count already exists in the set, return false
        return false;
      }
    }

    // If all occurrences are unique, return true
    return true;
  }

  public static void main(String[] args) {
    int num[] = { 1, 2 };
    System.out.println(uniqueOccurrences(num));
  }
}
