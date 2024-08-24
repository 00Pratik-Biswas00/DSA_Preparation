package gfg;

class Node {
  int data;
  Node next;

  Node(int data1) {
    this.data = data1;
    this.next = null;
  }
}

class LengthOfLL {

  private static Node constructLL(int arr[]) {

    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  public static int getCount(Node head) {
    // code here
    Node temp = head;
    int c = 0;
    while (temp != null) {
      temp = temp.next;
      c++;
    }
    return c;
  }

  public static boolean searchElement(int n, Node head, int key) {
    Node temp = head;
    while (temp != null) {

      if (temp.data == key)
        return true;
      temp = temp.next;

    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5, 3 };
    Node head = constructLL(arr);

    System.out.println(getCount(head));
    System.out.println(searchElement(5, head, 5));
  }
}
