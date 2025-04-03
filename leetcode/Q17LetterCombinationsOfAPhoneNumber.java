import java.util.ArrayList;
import java.util.List;

public class Q17LetterCombinationsOfAPhoneNumber {
    private static final String Digit_Array[] = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return list;
        }
        backTrack(list, new StringBuilder(), digits, 0);
        return list;
    }

    private static void backTrack(List<String> list, StringBuilder s, String digits, int index) {
        if (index == digits.length()) {
            list.add(s.toString());
            return;
        }
        String letters = Digit_Array[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            s.append(letter);
            backTrack(list, s, digits, index + 1);
            s.deleteCharAt(s.length() - 1);
        }

    }

    public static void main(String[] args) {
        List<String> combinations = letterCombinations("23");
        System.out.println(combinations);
    }
}
