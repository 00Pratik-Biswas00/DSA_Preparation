
class Solution {

  public static int removeDuplicates(int[] nums) {
    // floyd's algorithm
    // Initialize slow and fast pointers
    int slow = nums[0];
    int fast = nums[0];

    // Move slow one step and fast two steps until they meet
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    // Reset one pointer to the start
    slow = nums[0];

    // Move both pointers one step at a time until they meet again
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }

    // The meeting point is the duplicate number
    return slow;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 1, 1 };
    int n = nums.length - 1;

    int sum = (n * (n + 1)) / 2;
    int s = 0;
    int ans = 0;

    int firstElement = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == firstElement)
        ans = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      s += nums[i];
      ans = Math.abs(sum - s);
    }

    System.out.println(ans);

    // System.out.println(removeDuplicates(nums));
    ;
  }
}