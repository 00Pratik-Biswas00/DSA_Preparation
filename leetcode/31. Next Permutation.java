import java.util.Arrays;

class NextPermutation {

  public void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }

    if (i >= 0) {
      int j = nums.length - 1;
      while (j > i && nums[j] <= nums[i]) {
        j--;
      }
      swap(nums, i, j);
    }

    reverse(nums, i + 1);
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private void reverse(int[] nums, int start) {
    int i = start;
    int j = nums.length - 1;
    while (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    NextPermutation solution = new NextPermutation();

    int[] nums1 = { 1, 2, 3 };
    solution.nextPermutation(nums1);
    System.out.println("Next permutation of [1, 2, 3]: " + Arrays.toString(nums1)); // [1, 3, 2]

  }
}
