package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class A01_AddNode {
    Node head;
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

    public Node insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return newNode;
    }
    public void insertInBetween(int val,int index){
        Node newNode = new Node(val);
        Node temp = head;
        int count = 0;
        while(temp != null && count < index-1){
            temp = temp.next;
            count++;
        }
        if(temp == null) return;

        newNode.next = temp.next;
        temp.next = newNode;
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
        A01_AddNode list = new A01_AddNode();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at End");
            System.out.println("2. Insert at Head");
            System.out.println("3. Insert at Index");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int val1 = sc.nextInt();
                    list.insertAtEnd(val1);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int val2 = sc.nextInt();
                    list.insertAtHead(val2);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int val3 = sc.nextInt();
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    list.insertInBetween(val3, index);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
