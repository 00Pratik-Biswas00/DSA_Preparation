// sorting

// import java.util.Arrays;

// class PeakElement {
//   public static int findPeakElement(int[] nums) {
//     int temp[] = new int[nums.length];

//     for (int i = 0; i < nums.length; i++)
//       temp[i] = nums[i];

//     Arrays.sort(nums);
//     int ans = nums[nums.length - 1];

//     for (int i = 0; i < temp.length; i++)
//       if (ans == temp[i])
//         return i;
//     return -1;
//   }

//   public static void main(String[] args) {
//     int nums[] = { 1, 2, 1, 3, 5, 6, 4 };
//     System.out.println(findPeakElement(nums));
//   }
// }

// binary search 

class PeakElement {
  public static int findPeakElement(int[] nums) {
    int n = nums.length;
    if (n == 1)
      return 0;
    if (nums[0] > nums[1])
      return 0;
    if (nums[n - 1] > nums[n - 2])
      return n - 1;

    int low = 1, high = n - 2;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
        return mid;
      else if (nums[mid] > nums[mid - 1])
        low = mid + 1;
      else
        high = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 1, 3, 5, 6, 4 };
    System.out.println(findPeakElement(nums));
  }
}
