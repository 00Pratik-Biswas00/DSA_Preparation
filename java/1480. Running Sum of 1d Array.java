class RunningSum {
  public static int[] runningSum(int[] nums) {
    int[] ans = new int[nums.length];
    int runningTotal = 0;

    for (int i = 0; i < nums.length; i++) {
      runningTotal += nums[i];
      ans[i] = runningTotal;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 1, 1 };
    int[] res = runningSum(nums);
    for (int i : res)
      System.out.print(i + " ");
  }
}
