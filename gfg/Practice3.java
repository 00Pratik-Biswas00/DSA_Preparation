package gfg;

class Examples {
    // count bits
    public static int countBits(int n) {

        return 0;
    }

    // Get All Possible Numbers That Can Be Formed (Permutations of Digits)
    public static void generatePermutations(String str, String result) {

    }

    // Find Index of a Character in a String Without Using In-Built Function or Full
    // Iteration
    public static int findIndex(String str, char target) {
        return 0;
    }

    // Find the Maximum Missing Number in Array
    public static int findMissing(int[] arr, int n) {
        return 0;
    }

    //////////////////////////////////////////////////////////////////

    // insertion sort
    public int[] insertionSort(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int t = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = t;
                j--;
            }
        }
        return arr;
    }

}

public class Practice3 {

    public static void main(String[] args) {
        Examples e = new Examples();
        int arr[] = { 5, 6, 2, 3, 1, 9 };
        int a[] = e.insertionSort(arr);
        for (int n : a)
            System.out.print(n + " ");
    }
}
