package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class A04_SearchInLinkedList {
    static Node head;

    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean searchKey(Node head, int key) {
        if(head==null) return false;
        Node temp = head;
        while(temp != null){
            if(key == temp.val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A04_SearchInLinkedList list = new A04_SearchInLinkedList();

        while(true){
            System.out.println("\n1.Insert \n2.Display \n3.key \n4.Exit");
            int choice = sc.nextInt();
            if(choice == 4) System.out.println("Exiting...");
            switch (choice){
                case 1:
                    int val = sc.nextInt();
                    list.insertAtEnd(val);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    int key = sc.nextInt();
                    list.searchKey(head,key);

                default:
                    System.out.println("Invalid choice..");
                    break;
            }
        }
    }
}
