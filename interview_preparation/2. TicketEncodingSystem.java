// Ticket Encoding Sequence
// Last Updated : 09 Dec, 2023
// You are working at a ticketing company that generates unique ticket codes for various events. You have given a number N and your task is to print the Nth ticket code. The ticket codes are generated based on a specific encoding sequence. The encoding sequence follows the recursive formula as described below:

// The ticket code for the first ticket (ticket #1) is “A.”
// Now, to generate rth ticket you have to take an r-1 th ticket and create a new encoding by writing down the frequency followed by a digit.
// for example Ticket#(r-1) = “1121A” (Two 1, One 2, One 1, One A) so Ticket#(r) = “2112111A”
// Examples:

// Input: 4
// Output: 311A
// Explanation:

// Ticket #1: “A”
// Ticket #2: Use “A” => one A => “1A”
// Ticket #3: Use “1A” => one 1 + one A => “111A”
// Ticket #4: Use “111A” => three 1 + one A => “311A”
// Input: 3
// Output: 111A
// Explanation:

// Ticket #1: “A”
// Ticket #2: Use “A” => one A => “1A”
// Ticket #3: Use “1A” => one 1 + one A => “111A”

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
