package LinkedList.SinglyLL;

public class A01_InsertAtTheHead {
    public static ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);

        newNode.next = head;
        return newNode;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = null;

        head = insertAtHead(head, 30);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);

        printList(head);
    }
}
