package gfg;

class ListNode {
  int data;
  ListNode next;

  ListNode(int data1) {
    this.data = data1;
    this.next = null;
  }
}

public class Deletion {
  private static ListNode create(int[] arr) {
    ListNode head = new ListNode(arr[0]);
    ListNode mover = head;
    for (int i = 1; i < arr.length; i++) {
      ListNode temp = new ListNode(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  private static void display(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.print("NULL");
  }

  public static void deleteNode(ListNode node) {

  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 1, 9 };
    ListNode head = create(arr);
    display(head);
    System.out.println();

  }
}
