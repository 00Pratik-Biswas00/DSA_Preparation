import java.util.HashSet;

public class LongestConsecutiveSubsequence {
  public static int longestConsecutive(int[] nums) {
    int n = nums.length;
    if (n == 0)
      return 0;
    int longest = 1;
    HashSet<Integer> st = new HashSet<>();
    for (int i = 0; i < n; i++) {
      st.add(nums[i]);
    }
    for (int num : nums) {
      // Check if num is the start of a new sequence (i.e., num-1 is not in the set)
      if (!st.contains(num - 1)) {
        int currentNum = num;
        int currentLength = 1;

        // Count the length of the consecutive sequence starting from currentNum
        while (st.contains(currentNum + 1)) {
          currentNum++;
          currentLength++;
        }

        // Update the maximum length found
        longest = Math.max(longest, currentLength);
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    int nums[] = { 100, 4, 200, 1, 3, 2 };
    System.out.println(longestConsecutive(nums));
  }
}
