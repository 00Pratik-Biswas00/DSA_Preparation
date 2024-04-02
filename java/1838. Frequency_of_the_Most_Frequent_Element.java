import java.util.Arrays;

class MaxFrequencyElement {
  public static int maxFrequency(int[] nums, int k) {
    Arrays.sort(nums);
    int maxFreq = 0;
    int left = 0;
    long sum = 0;

    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];
      while ((long) nums[right] * (right - left + 1) - sum > k) {
        sum -= nums[left++];
      }
      maxFreq = Math.max(maxFreq, right - left + 1);
    }

    return maxFreq;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 4 };
    int k1 = 5;
    System.out.println(maxFrequency(nums1, k1)); // Output: 3

    int[] nums2 = { 1, 4, 8, 13 };
    int k2 = 5;
    System.out.println(maxFrequency(nums2, k2)); // Output: 2

    int[] nums3 = { 3, 9, 6 };
    int k3 = 2;
    System.out.println(maxFrequency(nums3, k3)); // Output: 1
  }
}

// https://youtu.be/vgBrQ0NM5vE?si=8csN05x1LObHrr7s
