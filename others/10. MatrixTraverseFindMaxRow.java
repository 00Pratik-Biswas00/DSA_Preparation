package others;

/*
 * A parking lot in a park has MxN number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find the row with have maximum number of cars parked in it.

Note :

MxN- Size of the matrix

M is the number of row and N is number of columns
Elements of the matrix M should be only 0 or 1.

Input Format:

1) The first line of input contains the value M the number of rows.

2) The second line of input contains value N represents the number of columns.

3) Next line contains a matrix with values 1 and 0

Output Format:

Print the Row which have maximum number of cars parked in it.

Sample Input1:

R=3

L=4

Matrix= 0   1   0   0

                1  1   0    1

                1   1  1     1

Output : 3 Row 3 have maximum number of 1.
 */
import java.util.Scanner;

class MatrixTraverseFindMaxRow {

  public int maxCount(int n, int l, int mat[][]) {
    int maxCount = 0; // To track the maximum count of 1s
    int maxRowIndex = -1;
    for (int i = 0; i < n; i++) {

      int count = 0; // To count the number of 1s in the current row
      for (int j = 0; j < l; j++) {
        if (mat[i][j] == 1) {
          count++;
        }
      }

      if (count > maxCount) {
        maxCount = count;
        maxRowIndex = i; // Update the row index with the maximum count
      }

    }
    return maxRowIndex + 1; // Return the row number (1-indexed)
  }

  public static void main(String[] args) {
    MatrixTraverseFindMaxRow ans = new MatrixTraverseFindMaxRow();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int n = sc.nextInt();
    System.out.println("Enter number of cols: ");
    int l = sc.nextInt();

    // Declare the matrix
    int first[][] = new int[n][l];

    // Read the matrix values
    System.out.println("Enter the elements of the matrix");
    for (int i = 0; i < n; i++)
      for (int j = 0; j < l; j++)
        first[i][j] = sc.nextInt();

    int a = ans.maxCount(n, l, first);
    System.out.println("ans:" + a);
    sc.close();
  }
}
