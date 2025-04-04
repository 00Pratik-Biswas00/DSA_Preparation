import java.util.Stack;

public class Q316RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        if (s == null || s.isEmpty())
            return "";
        int arr[] = new int[26];
        boolean presentInStack[] = new boolean[26];

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            arr[ch - 'a']--;
            if (presentInStack[ch - 'a'])
                continue;
            while (!stack.isEmpty() && ch < stack.peek() && arr[stack.peek() - 'a'] > 0) {
                presentInStack[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            presentInStack[ch - 'a'] = true;
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("bcabc"));
    }
}
