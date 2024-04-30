import java.util.Arrays;

class PeakElement {
  public static int findPeakElement(int[] nums) {
    int temp[] = new int[nums.length];

    for (int i = 0; i < nums.length; i++)
      temp[i] = nums[i];

    Arrays.sort(nums);
    int ans = nums[nums.length - 1];

    for (int i = 0; i < temp.length; i++)
      if (ans == temp[i])
        return i;
    return -1;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 1, 3, 5, 6, 4 };
    System.out.println(findPeakElement(nums));
  }
}
