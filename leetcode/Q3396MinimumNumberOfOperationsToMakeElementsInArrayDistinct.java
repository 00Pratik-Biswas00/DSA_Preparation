import java.util.HashSet;
import java.util.Set;

public class Q3396MinimumNumberOfOperationsToMakeElementsInArrayDistinct {

    public static int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!seen.add(nums[i])) {
                return (i / 3) + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 2, 3, 3, 5, 7 };
        System.out.println(minimumOperations(a));
    }
}
