class maxSubArray {
  public static int max_SubArray(int[] nums) {
    // Kadane's algorithm
    int sum = 0;
    int max_sum = nums[0];
    for (int ele : nums) {
      sum += ele;
      max_sum = Math.max(max_sum, sum);
      // if sum is negative then it's obvious that it doesn't give the largest sum so
      // it set to 0
      if (sum < 0)
        sum = 0;
    }
    return max_sum;
  }

  public static void main(String[] args) {
    int nums[] = { 5, 4, -1, 7, 8 };
    System.out.println(max_SubArray(nums));
  }
}
