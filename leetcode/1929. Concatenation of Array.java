class ConcatArray {
  public static int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int result[] = new int[2 * n];
    for (int i = 0; i < n; i++)
      result[i] = nums[i];

    for (int i = n; i < result.length; i++)
      result[i] = nums[i - n];

    return result;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3 };
    int res[] = getConcatenation(nums);
    for (int i : res)
      System.out.println(i);
  }
}
