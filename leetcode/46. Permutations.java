import java.util.ArrayList;
import java.util.List;

class Permutations {

  private void swap(int i, int j, int arr[]) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  private void recursivePermutation(int index, int[] nums, List<List<Integer>> ans) {
    for (int i = index; i < nums.length; i++) {
      swap(index, i, nums);
      recursivePermutation(index + 1, nums, ans);
      swap(index, i, nums);
    }

    if (nums.length == index) {
      List<Integer> storing_data = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        storing_data.add(nums[i]);
      }
      ans.add(new ArrayList<>(storing_data));
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    recursivePermutation(0, nums, ans);
    return ans;
  }

  public static void main(String[] args) {
    Permutations permutaion = new Permutations();
    int nums[] = { 1, 2, 3 };
    List<List<Integer>> result = permutaion.permute(nums);

    for (List<Integer> p : result)
      System.out.println(p);

  }
}
