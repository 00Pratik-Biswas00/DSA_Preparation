
/**
 * hehe
 */
import java.util.Arrays;

class sss {

  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = (n * (n + 1)) / 2;
    int s = 0;
    for (int i = 0; i < n; i++) {
      s = s + nums[i];
    }
    return sum - s;
  }

  public static void main(String[] args) {
    int[] num = { 1, 0 };
    System.out.println(missingNumber(num));
  }
}