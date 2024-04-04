
public class checkSorted {
  public static boolean check(int[] nums) {
    int count = 0; // to count if there is a pair where next element is larger than the prev and
                   // the last element is larger than the first element
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > nums[i]) { // checking if the next element is larger than the prev
        count++;
      }
    }

    if (nums[nums.length - 1] > nums[0])
      count++;

    return count <= 1; // "<" is used if all the elements are same then count will be 0
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 1, 1 };
    System.out.println(check(nums1));
    ;
  }
}