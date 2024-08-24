import java.util.ArrayList;
import java.util.List;

class Candies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();

    // Find the maximum number of candies any kid currently has
    int maxCandies = 0;
    for (int candy : candies) {
      if (candy > maxCandies) {
        maxCandies = candy;
      }
    }

    // Determine if each kid can have the greatest number of candies
    for (int i = 0; i < candies.length; i++) {
      result.add(candies[i] + extraCandies >= maxCandies);
    }

    return result;
  }

  public static void main(String[] args) {
    Candies Candies = new Candies();

    int[] candies1 = { 2, 3, 5, 1, 3 };
    int extraCandies1 = 3;
    System.out.println(Candies.kidsWithCandies(candies1, extraCandies1));
  }
}
