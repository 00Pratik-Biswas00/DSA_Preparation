class SnakeGame {

    public static int finalPosition(int n, String[] commands) {
        int row = 0, col = 0;

        for (String command : commands) {
            switch (command) {
                case "UP":
                    row = row - 1;
                    break;
                case "DOWN":
                    row = row + 1;
                    break;
                case "LEFT":
                    col = col - 1;
                    break;
                case "RIGHT":
                    col = col + 1;
                    break;
            }
        }

        int finalPosition = (row * n) + col;
        return finalPosition;
    }

    public static void main(String[] args) {
        int n1 = 2;
        String[] commands1 = { "RIGHT", "DOWN" };
        System.out.println(finalPosition(n1, commands1)); // Output: 3

        int n2 = 3;
        String[] commands2 = { "DOWN", "DOWN", "RIGHT", "RIGHT", "UP" };
        System.out.println(finalPosition(n2, commands2)); // Output: 7

        int n3 = 4;
        String[] commands3 = { "RIGHT", "RIGHT", "DOWN", "LEFT", "DOWN" };
        System.out.println(finalPosition(n3, commands3)); // Output: 8
    }
}
