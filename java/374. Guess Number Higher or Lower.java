// Forward declaration of guess API
class GuessGame {
  // Example implementation
  static int pick;

  static int guess(int num) {
    if (num == pick)
      return 0;
    return num < pick ? 1 : -1;
  }
}

class GuessHigherLower extends GuessGame {
  public static int guessNumber(int n) {
    int left = 1;
    int right = n;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      int result = guess(mid);

      if (result == 0) {
        return mid;
      } else if (result < 0) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    // If no number is found, return -1 or any other appropriate value
    return -1;
  }

  public static void main(String[] args) {

    // Test cases
    GuessGame game1 = new GuessGame();
    game1.pick = 6;
    System.out.println("Guess Number for n = 10, pick = 6: " + guessNumber(10));

    GuessGame game2 = new GuessGame();
    game2.pick = 1;
    System.out.println("Guess Number for n = 1, pick = 1: " + guessNumber(1));

    GuessGame game3 = new GuessGame();
    game3.pick = 1;
    System.out.println("Guess Number for n = 2, pick = 1: " + guessNumber(2));
  }
}
