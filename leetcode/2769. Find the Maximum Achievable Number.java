
class MaxAchieveableNumber {

  public static int theMaximumAchievableX(int num, int t) {
    for (int i = 0; i < t; i++) {
      num++;
    }
    return num + t;
  }

  public static void main(String[] args) {
    System.out.println(theMaximumAchievableX(3, 2));
  }
}