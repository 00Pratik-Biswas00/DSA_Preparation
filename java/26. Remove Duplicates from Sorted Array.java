class re {

  public static int removeDuplicates(int[] nums) {
    int firstPointer = 0;

    for (int secondPointer = 1; secondPointer < nums.length; secondPointer++) {
      if (nums[firstPointer] != nums[secondPointer]) {
        nums[firstPointer + 1] = nums[secondPointer];
        firstPointer++;
      }
    }
    return firstPointer + 1;
  }

  public static void main(String[] args) {
    int[] num = { 1, 1, 2, 2, 2, 6, 3 };
    System.out.println(removeDuplicates(num));
    ;
  }
}