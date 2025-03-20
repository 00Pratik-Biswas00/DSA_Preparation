package others;

public class Q22SwapStringDigitsBasedOnCondition {
    public int solution(String S, String T) {
        int ans = 0;
        if (S == null || T == null || S.isEmpty() || T.isEmpty()) {
            throw new IllegalArgumentException("Null value is present");
        }
        if (Character.getNumericValue(S.charAt(0)) > Character.getNumericValue(T.charAt(0))) {
            ans = 0;
        }
        for (int i = 1; i < S.length(); i++) {
            if (Character.getNumericValue(S.charAt(i)) > Character.getNumericValue(T.charAt(i))) {
                swap(i, i);
                ans++;
            }
        }
        return ans;
    }

    private void swap(int i, int j) {
        int t = i;
        i = j;
        j = t;
    }

    public static void main(String[] args) {
        Q22SwapStringDigitsBasedOnCondition obj = new Q22SwapStringDigitsBasedOnCondition();
        System.out.println(obj.solution("", ""));
    }
}
