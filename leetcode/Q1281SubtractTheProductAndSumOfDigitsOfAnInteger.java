
public class Q1281SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n != 0) {
            int k = n % 10;
            sum += k;
            prod *= k;
            n /= 10;
        }
        return prod - sum;
    }

    public static void main(String[] args) {
        Q1281SubtractTheProductAndSumOfDigitsOfAnInteger obj = new Q1281SubtractTheProductAndSumOfDigitsOfAnInteger();
        System.out.println(obj.subtractProductAndSum(234));
    }
}
