
class ListNode {
  int data;
  ListNode next;

  ListNode(int data1) {
    this.data = data1;
    this.next = null;
  }
}

class ListNodeDeletion {
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
    node.data = node.next.data;
    node.next = node.next.next;
  }

  public static void main(String[] args) {
    // Creating the linked list: 4 -> 5 -> 1 -> 9
    ListNode head = new ListNode(4);
    head.next = new ListNode(5);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(9);

    // Print original list
    System.out.print("Original List: ");
    display(head);

    // Find the node with value 5 (which is head.next in this case)
    ListNode nodeToDelete = head.next;

    // Call deleteNode function
    deleteNode(nodeToDelete);

    // Print the updated list
    System.out.print("Updated List after deleting node 5: ");
    display(head);
  }
}
