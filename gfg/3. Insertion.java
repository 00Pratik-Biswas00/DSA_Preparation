package gfg;

class ListNode {
  int data;
  ListNode next;

  ListNode(int data1) {
    this.data = data1;
    this.next = null;
  }
}

class Insertion {

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

  private static ListNode insertEnd(ListNode head, int x) {
    if (head == null) {
      return new ListNode(x);
    }
    ListNode temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    ListNode newData = new ListNode(x);
    temp.next = newData;

    return head;
  }

  private static ListNode insertHead(ListNode head, int x) {
    if (head == null) {
      return new ListNode(x);
    }
    ListNode temp = new ListNode(x);

    temp.next = head;
    head = temp;
    return head;
  }

  private static int size(ListNode head) {
    if (head == null) {
      return 1;
    }
    int size = 0;
    ListNode temp = head;

    while (temp != null) {
      temp = temp.next;
      size++;
    }
    return size;
  }

  private static ListNode insertIndex(ListNode head, int val, int ind) {
    int size = size(head);
    if (ind > size + 1)
      System.out.println("not possible");

    if (head == null) {
      if (ind == 1)
        return new ListNode(val);
      else
        return head;
    }
    if (ind == 1) {
      ListNode temp = new ListNode(val);

      temp.next = head;
      head = temp;
      return head;
    }
    ListNode temp = head;

    int c = 0;
    while (temp != null) {
      c++;
      if (c == ind - 1) {
        ListNode newData = new ListNode(val);
        newData.next = temp.next;
        temp.next = newData;
        break;
      }
      temp = temp.next;
    }

    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    ListNode head = create(arr);
    display(head);
    System.out.println();
    insertEnd(head, 6);
    display(head);
    System.out.println();
    head = insertHead(head, 0);
    display(head);
    System.out.println();
    head = insertIndex(head, 10, 2);
    display(head);
  }
}
