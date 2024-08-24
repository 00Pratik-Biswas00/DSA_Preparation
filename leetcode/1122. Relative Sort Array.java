import java.util.*;

class RelativeSorting {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : arr1) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();

    for (int num : arr2) {
      int count = frequencyMap.get(num);
      for (int i = 0; i < count; i++) {
        result.add(num);
      }
      frequencyMap.remove(num);
    }
    List<Integer> remainingElements = new ArrayList<>();
    for (int num : arr1) {
      if (frequencyMap.containsKey(num)) {
        remainingElements.add(num);
      }
    }
    Collections.sort(remainingElements);

    result.addAll(remainingElements);

    int[] resultArray = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      resultArray[i] = result.get(i);
    }

    return resultArray;
  }

  public static void main(String[] args) {
    RelativeSorting solution = new RelativeSorting();

    int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
    int[] arr2 = { 2, 1, 4, 3, 9, 6 };
    System.out.println(Arrays.toString(solution.relativeSortArray(arr1, arr2)));

    int[] arr1b = { 28, 6, 22, 8, 44, 17 };
    int[] arr2b = { 22, 28, 8, 6 };
    System.out.println(Arrays.toString(solution.relativeSortArray(arr1b, arr2b)));
  }
}
