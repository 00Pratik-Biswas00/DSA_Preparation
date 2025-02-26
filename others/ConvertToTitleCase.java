package others;

import java.util.Scanner;

public class ConvertToTitleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String titleCasedSentence = toTitleCase(inputSentence);

        System.out.println("Formatted Output: " + titleCasedSentence);

        scanner.close();
    }

    private static String toTitleCase(String sentence) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            } else {
                c = Character.toLowerCase(c);
            }
            if (!Character.isSpaceChar(c)) {
                titleCase.append(c);
            }
        }

        return titleCase.toString();
    }
}
