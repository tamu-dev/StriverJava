package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class A02_DeleteNode {
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

    public void deleteHead(){
        if(head == null) return;

        head = head.next;
    }

    public Node deleteLastNode(){
        if(head == null) return null;

        Node temp = head;
        while(temp != null){
            if(temp.next.next == null){
                return temp.next = null;
            }
            temp = temp.next;
        }
        return head;
    }

    public Node deleteIndexNode(int n){
        if(head == null) return null;
        Node temp = head;
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        temp = head;
        for(int i=0;i<count-n-1;i++){
            temp.next = temp.next.next;
        }
        return head;
    }
    public boolean contains(int x) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == x) return true;
            temp = temp.next;
        }
        return false;
    }

    public void deleteUniqueValueNode(int x){
        if(head == null) return;
        if(!contains(x)){
            System.out.println("Not present");
        }
        if(head.val == x) head = head.next;

        Node temp = head;
        while(temp != null){
            if(temp.next.val == x){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
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
        A02_DeleteNode list = new A02_DeleteNode();

        while (true) {
            System.out.println("\n1.Insert \n2.DeleteHead \n3.DeleteLast \n4.DeleteIndex \n5.DeleteValue \n6.Display \n0.Exit");
            int choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    int val = sc.nextInt();
                    list.insertAtEnd(val);
                    break;

                case 2:
                    list.deleteHead();
                    break;

                case 3:
                    list.deleteLastNode();
                    break;

                case 4:
                    int index = sc.nextInt();
                    list.deleteIndexNode(index);
                    break;

                case 5:
                    int value = sc.nextInt();
                    list.deleteUniqueValueNode(value);
                    break;

                case 6:
                    list.display();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
