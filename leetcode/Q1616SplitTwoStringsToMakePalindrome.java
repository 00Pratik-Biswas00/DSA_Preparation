public class Q1616SplitTwoStringsToMakePalindrome {
    private boolean check(String a, String b) {
        int l = 0, r = b.length() - 1;
        while (l < r && a.charAt(l) == b.charAt(r)) {
            l++;
            r--;
        }
        if (l >= r)
            return true;
        return isPal(a.substring(l, r + 1)) || isPal(b.substring(l, r + 1));
    }

    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    private boolean isPal(String a) {
        int l = 0, r = a.length() - 1;
        while (l < r && a.charAt(l) == a.charAt(r)) {
            l++;
            r--;
        }
        return l >= r;
    }

    public static void main(String[] args) {
        Q1616SplitTwoStringsToMakePalindrome obj = new Q1616SplitTwoStringsToMakePalindrome();
        System.out.println(obj.checkPalindromeFormation("pvhmupgqeltozftlmfjjde", "yjgpzbezspnnpszebzmhvp"));
    }
}
