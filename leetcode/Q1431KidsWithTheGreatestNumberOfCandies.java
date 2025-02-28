import java.util.ArrayList;
import java.util.List;

public class Q1431KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max)
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 1, 3 };
        List<Boolean> result = kidsWithCandies(arr, 3);
        for (Boolean l : result) {
            System.out.println(l + " ");
        }
    }
}
