
public class Q1694ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        StringBuilder res = new StringBuilder();
        for (char i : number.toCharArray()) {
            if (Character.isDigit(i))
                res.append(i);

        }
        StringBuilder ans = new StringBuilder();
        int l = res.length();
        int ind = 0;
        while ((l - ind) > 4) {
            ans.append(res.substring(ind, ind + 3)).append('-');
            ind += 3;
        }
        if ((l - ind) == 4) {
            ans.append(res.substring(ind, ind + 2)).append('-').append(res.substring(ind + 2));

        } else {
            ans.append(res.substring(ind));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
    }
}
