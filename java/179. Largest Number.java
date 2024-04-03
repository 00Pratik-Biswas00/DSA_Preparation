import java.util.Arrays;

class largest_number {
  public static String largestNumber(int[] nums) {
    // array to string
    String[] stringArray = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      stringArray[i] = String.valueOf(nums[i]);
    }

    // (a, b) specifies the two elements being compared during the sorting process.
    // -> is the lambda operator that separates the parameter list from the body of
    // the lambda expression.
    // (b + a).compareTo(a + b) is the body of the lambda expression. Here's what it
    // does:
    // b + a and a + b concatenate the strings a and b in two different orders.
    // .compareTo() is a method used to compare strings lexicographically. It
    // returns:
    // a negative integer if the first string (in this case, b + a) comes before the
    // second string (a + b) lexicographically.
    // zero if the strings are equal.
    // a positive integer if the first string comes after the second string
    // lexicographically.

    Arrays.sort(stringArray, (a, b) -> (b + a).compareTo(a + b));

    if (stringArray[0].equals("0")) {
      return "0";
    }

    StringBuilder sb = new StringBuilder();
    for (String str : stringArray) {
      sb.append(str);
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    int[] nums1 = { 3, 30, 34, 5, 9 };
    System.out.println(largestNumber(nums1));
  }
}