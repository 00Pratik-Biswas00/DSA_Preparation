import java.util.Arrays;

class PowerOfKSubArray {
  public static int[] resultsArray(int[] nums, int k) {
    int n = nums.length;
    int[] results = new int[n - k + 1];

    for (int i = 0; i <= n - k; i++) {
      boolean isValid = true;
      int maxElement = nums[i];

      for (int j = i + 1; j < i + k; j++) {
        if (nums[j] != nums[j - 1] + 1) {
          isValid = false;
          break;
        }
        maxElement = Math.max(maxElement, nums[j]);
      }

      results[i] = isValid ? maxElement : -1;
    }

    return results;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 4, 3, 2, 5 };
    int k1 = 3;
    System.out.println(Arrays.toString(resultsArray(nums1, k1))); // Output: [3, 4, -1, -1, -1]

  }
}
