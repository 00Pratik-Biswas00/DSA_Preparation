// Problem Statement : A young prodigy Zoey stumbled upon a mysterious challenge left by puzzle master. Arrange the pieces in unique combination that would sum up to a magic number provided by master. No piece can be used more than once. Find the number of unique combos that are possible in java

// Explanation

// Let the numbered puzzle pieces be 10, 1, 2, 7, 6, 1, 5 and the puzzle master gives the magic number as 8. So, the unique combinations whose sum is equal to 8 are [[1,1.6]. [1,2,5], [1.7], [2.6]]. So the count of combinations is 4

package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class PuzzlePuzzleville {

  public static int combinationSum(int[] pieces, int magicNumber) {
    Arrays.sort(pieces); // Sort the array to handle duplicates easily
    List<List<Integer>> result = new ArrayList<>();
    findCombinations(pieces, magicNumber, 0, new ArrayList<>(), result);
    return result.size(); // Return the number of unique combinations
  }

  private static void findCombinations(int[] pieces, int magicNumber, int start, List<Integer> currentCombination,
      List<List<Integer>> result) {
    if (magicNumber == 0) {
      result.add(new ArrayList<>(currentCombination)); // Found a valid combination
      return;
    }
    for (int i = start; i < pieces.length; i++) {
      // Skip duplicates
      if (i > start && pieces[i] == pieces[i - 1])
        continue;

      if (pieces[i] > magicNumber)
        break; // No point in continuing if the number is larger than the target

      currentCombination.add(pieces[i]);
      findCombinations(pieces, magicNumber - pieces[i], i + 1, currentCombination, result); // Move to next piece
      currentCombination.remove(currentCombination.size() - 1); // Backtrack
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of positive integers: ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    System.out.println("Enter magic number: ");
    int k = sc.nextInt();

    System.out.println("Enter the positive integers: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    if (k == 0)
      System.out.println("Number of unique combinations: " + 0);
    else
      System.out.println("Number of unique combinations: " + combinationSum(arr, k));

    sc.close();
  }

}
