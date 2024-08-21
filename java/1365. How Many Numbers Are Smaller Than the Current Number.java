class SmallerThanCurrentNumber {
  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int n = nums.length;
    int[] count = new int[101]; // Since 0 <= nums[i] <= 100
    int[] result = new int[n];

    // Count the occurrence of each number
    for (int num : nums) {
      count[num]++;
    }

    // Calculate the cumulative count
    for (int i = 1; i < 101; i++) {
      count[i] += count[i - 1];
    }

    // Find the number of elements smaller than each element
    for (int i = 0; i < n; i++) {
      if (nums[i] == 0) {
        result[i] = 0;
      } else {
        result[i] = count[nums[i] - 1];
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 8, 1, 2, 2, 3 };
    int[] res = smallerNumbersThanCurrent(nums);
    for (int i : res)
      System.out.print(i + " ");
  }
}
