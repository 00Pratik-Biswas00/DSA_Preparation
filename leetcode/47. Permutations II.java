import java.util.*;

class PermutationWithDuplicateNumbers {
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums); // Sort the array to handle duplicates efficiently
    boolean[] used = new boolean[nums.length];
    List<Integer> current = new ArrayList<>();
    backtrack(nums, used, current, result);
    return result;
  }

  private void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
    if (current.size() == nums.length) {
      result.add(new ArrayList<>(current)); // Add a copy of current to the result
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      // Skip duplicates or already used elements
      if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
        continue;
      }

      // Choose nums[i] for the current permutation
      used[i] = true;
      current.add(nums[i]);

      // Recursively generate permutations with the updated current permutation
      backtrack(nums, used, current, result);

      // Backtrack: Remove nums[i] from current permutation for the next iteration
      used[i] = false;
      current.remove(current.size() - 1);
    }
  }

  public static void main(String[] args) {
    PermutationWithDuplicateNumbers solution = new PermutationWithDuplicateNumbers();

    int[] nums = { 1, 2, 1 };
    List<List<Integer>> result = solution.permuteUnique(nums);

    for (List<Integer> permutation : result) {
      System.out.println(permutation);
    }
  }
}
