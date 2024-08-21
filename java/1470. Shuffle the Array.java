class ShuffleArray {
  public static int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];
    int j = 0;
    for (int i = 0; i < n; i++) {
      result[j++] = nums[i];
      result[j++] = nums[i + n];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    int[] res = shuffle(nums, 3);
    for (int i : res)
      System.out.print(i);
  }
}
