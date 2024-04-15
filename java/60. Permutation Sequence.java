import java.util.*;

class PermutationSequence {
  public String getPermutation(int n, int k) {
    List<Integer> digits = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      digits.add(i);
    }

    int factorial = 1;
    for (int i = 1; i < n; i++) {
      factorial = factorial * i;
    }

    StringBuilder sb = new StringBuilder();
    k--; // Convert k to 0-based index for easier calculation

    for (int i = n; i > 0; i--) {
      int idx = k / factorial;
      sb.append(digits.get(idx));
      digits.remove(idx); // Remove used digit
      if (digits.size() == 0)
        break;
      k %= factorial; // Update k for the next iteration
      factorial = factorial / digits.size();
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    PermutationSequence solution = new PermutationSequence();

    int n1 = 3, k1 = 3;
    System.out.println(solution.getPermutation(n1, k1)); // Output: "213"

    int n2 = 4, k2 = 9;
    System.out.println(solution.getPermutation(n2, k2)); // Output: "2314"

    int n3 = 3, k3 = 1;
    System.out.println(solution.getPermutation(n3, k3)); // Output: "123"
  }
}
