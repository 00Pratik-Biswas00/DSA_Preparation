public class Q942DIStringMatch {
    public static int[] diStringMatch(String s) {
        int perm[] = new int[s.length() + 1];
        int left = 0, right = s.length();
        for (int ch = 0; ch < s.length(); ch++) {
            if (s.charAt(ch) == 'I') {
                perm[ch] = left;
                left++;
            } else if (s.charAt(ch) == 'D') {
                perm[ch] = right;
                right--;
            }
        }
        if (s.charAt(s.length() - 1) == 'D')
            perm[s.length()] = right;
        else
            perm[s.length()] = left;

        return perm;
    }

    public static void main(String[] args) {
        int arr[] = diStringMatch("III");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
