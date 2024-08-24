
class FirstLastOccurence {
  public static int[] searchRange(int[] nums, int target) {
    int fPoint = -1, lPoint = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        if (i == 0)
          fPoint = i;
        else if (nums[i - 1] < target)
          fPoint = i;

        if (i == nums.length - 1)
          lPoint = i;
        else if (nums[i + 1] > target)
          lPoint = i;
      }

    }
    int res[] = { fPoint, lPoint };
    return res;
  }

  public static void main(String[] args) {
    int nums[] = { 5, 7, 7, 8, 8 };
    int res[] = searchRange(nums, 8);
    for (int i : res)
      System.out.println(i);
  }
}
