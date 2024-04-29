class FindSingleElement {
  public static int singleNonDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; i = i + 2) {
      int length = nums.length;
      if (length == 1) {
        return nums[0];

      }
      if (nums[0] != nums[1]) {
        return nums[0];
      } else if (nums[length - 1] != nums[length - 2]) {
        return nums[length - 1];
      }

      int low = 1;
      int high = length - 2;

      while (low <= length) {
        int mid = (low + high) / 2;

        if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
          return nums[mid];
        }

        if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
            (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
          low = mid + 1;
        }

        else {
          high = mid - 1;
        }
      }

    }
    return 0;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 1, 2, 2, 3, 4, 4, 8, 8 };
    System.out.println(singleNonDuplicate(nums));
  }
}
