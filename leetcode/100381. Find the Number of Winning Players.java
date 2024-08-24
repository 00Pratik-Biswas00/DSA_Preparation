import java.util.HashMap;
import java.util.Map;

class NumberOfWinningPlayers {
  public static int winningPlayerCount(int n, int[][] pick) {
    Map<Integer, Map<Integer, Integer>> playerColorCount = new HashMap<>();

    for (int i = 0; i < n; i++) {
      playerColorCount.put(i, new HashMap<>());
    }
    for (int[] p : pick) {
      int player = p[0];
      int color = p[1];
      playerColorCount.get(player).put(color, playerColorCount.get(player).getOrDefault(color, 0) + 1);
    }

    int winnerCount = 0;
    for (int i = 0; i < n; i++) {
      Map<Integer, Integer> colorCount = playerColorCount.get(i);
      for (int count : colorCount.values()) {
        if (count >= i + 1) {
          winnerCount++;
          break;
        }
      }
    }

    return winnerCount;
  }

  public static void main(String[] args) {
    int n = 4;
    int pick[][] = { { 0, 0 }, { 1, 0 }, { 1, 0 }, { 2, 1 }, { 2, 1 }, { 2, 0 } };
    System.out.println(winningPlayerCount(n, pick));
  }
}
