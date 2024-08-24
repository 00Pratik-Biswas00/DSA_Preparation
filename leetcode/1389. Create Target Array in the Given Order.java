import java.util.ArrayList;
import java.util.List;

class CreateTargetArrayInOrder {

  public static int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> targetList = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      targetList.add(index[i], nums[i]);
    }

    int[] targetArray = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      targetArray[i] = targetList.get(i);
    }

    return targetArray;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 3, 4 };
    int[] index = { 0, 1, 2, 2, 1 };
    int[] res = createTargetArray(nums, index);
    for (int i : res)
      System.out.print(i + " ");
  }
}
