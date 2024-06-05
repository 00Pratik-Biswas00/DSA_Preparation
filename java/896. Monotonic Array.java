class Monotonic {
  public static boolean isMonotonic(int[] nums) {
    boolean inc = true, dec = true;
    if (nums.length == 1)
      return true;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1])
        inc = false;

    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i - 1])
        dec = false;

    }
    return inc || dec;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 2 };
    System.out.println(isMonotonic(nums));
  }
}
