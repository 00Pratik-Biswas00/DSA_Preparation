import java.util.HashSet;
import java.util.Set;

public class Q2367NumberOfArithmeticTriplets {
    public static int arithmeticTriplets(int[] nums, int diff) {
        int c = 0;
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }
        for (int i : nums) {
            if (s.contains(i + diff) && s.contains(i + 2 * diff))
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 4, 6, 7, 10 };
        System.out.println(arithmeticTriplets(a, 3));
    }
}
