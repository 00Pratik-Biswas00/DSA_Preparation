class SearchInRotatedSortedArrayII {
  public static boolean searchII(int[] nums, int target) {
    int n = nums.length;
    // if (n == 1)
    // if (nums[0] == target)
    // return true;

    // if (nums[n - 1] == target)
    // return true;

    int low = 0, high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] == target)
        return true;

      if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
        low++;
        high--;
        continue;
      }
      if (nums[low] <= nums[mid]) {
        if (nums[low] <= target && target <= nums[mid]) {
          high = mid - 1;
        } else
          low = mid + 1;
      } else {
        if (nums[mid] <= target && target <= nums[high]) {
          low = mid + 1;
        } else
          high = mid - 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 0, 1, 1, 1, 1 };
    System.out.println(searchII(nums, 0));
  }
}
