package interview_preparation;

import java.util.Scanner;

class TicketEncodingSystem {
  public static String generateTicket(int N) {
    StringBuilder ticketCode = new StringBuilder("A");

    for (int i = 2; i <= N; i++) {
      StringBuilder newTicket = new StringBuilder();
      char currentChar = ticketCode.charAt(0);
      int charCount = 0;
      for (int j = 0; j < ticketCode.length(); j++) {
        if (ticketCode.charAt(j) == currentChar)
          charCount++;
        else {
          newTicket.append(charCount).append(currentChar);
          currentChar = ticketCode.charAt(j);
          charCount = 1;
        }
      }

      newTicket.append(charCount).append(currentChar);
      ticketCode = newTicket;
    }

    return ticketCode.toString();
  }

  public static void main(String[] args) {
    int N;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Ticket Number: ");
    N = sc.nextInt();
    String ticketCode = generateTicket(N);
    System.out.println(ticketCode);
    sc.close();
  }

}
