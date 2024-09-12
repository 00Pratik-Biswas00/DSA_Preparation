package others;

import java.util.Scanner;

class Fib {

  public void fibo(int limit) {
    int n1 = 0, n2 = 1;
    int count = 2;
    System.out.print(n1 + " " + n2 + " ");
    while (count < limit) {
      int next = n1 + n2;
      count++;
      System.out.print(next + " ");
      n1 = n2;
      n2 = next;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Fib fib = new Fib();
    fib.fibo(n);

  }

}
