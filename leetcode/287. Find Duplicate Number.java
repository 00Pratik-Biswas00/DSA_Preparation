
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
    System.out.println(removeDuplicates(nums));
    ;
  }
}