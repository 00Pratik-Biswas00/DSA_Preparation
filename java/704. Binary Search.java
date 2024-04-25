class binarySearch {

  public static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (right + left) / 2;

      if (nums[mid] == target) {
        return mid; // Found the target
      } else if (nums[mid] < target) {
        left = mid + 1; // Search in the right half
      } else {
        right = mid - 1; // Search in the left half
      }
    }

    return -1; // Target not found
  }

  public static void main(String[] args) {
    int[] nums1 = { -1, 0, 3, 5, 9, 12 };
    int target1 = 9;
    System.out.println("Index of " + target1 + " in nums1: " + search(nums1, target1)); // Output: 4

    int[] nums2 = { -1, 0, 3, 5, 9, 12 };
    int target2 = 2;
    System.out.println("Index of " + target2 + " in nums2: " + search(nums2, target2)); // Output: -1
  }
}
