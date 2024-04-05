
/**
 * hehe
 */
import java.util.*;

class hehe {

  public static void moveZeroes(int[] num) {
    int num_length = num.length;
    int j = -1;
    // storing the 0 value index in j
    for (int i = 0; i < num_length; i++) {
      if (num[i] == 0) {
        j = i;
        break;
      }
    }

    // if no zeros are there print the array as it is
    if (j == -1) {
      String str = Arrays.toString(num);
      str = str.replaceAll(" ", "");
      System.out.println(str);
    } else {

      // pointing the second pointer after the next index of j and compare if it is
      // non zero then swap it
      for (int i = j + 1; i < num_length; i++) {
        if (num[i] != 0) {
          int temp = num[j];
          num[j] = num[i];
          num[i] = temp;
          j++;
        }
      }
      String str = Arrays.toString(num);
      str = str.replaceAll(" ", "");
      System.out.println(str);
    }

  }

  public static void main(String[] args) {
    int[] num = { 1, 0, 4, 2, 3 };
    moveZeroes(num);
  }
}