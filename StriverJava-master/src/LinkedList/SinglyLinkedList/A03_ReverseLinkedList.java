package LinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class A03_ReverseLinkedList {
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

    public Node reversedLikedList(){
        if(head == null) return null;

        ArrayList <Integer> arr = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }

        LinkedList <Integer> list = new LinkedList<>();

        Collections.reverse(arr);
        temp = head;
        int i = 0;
        while(temp != null){
            temp.val = arr.get(i);
            temp = temp.next;
            i++;
        }
        return head;
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
        A03_ReverseLinkedList list = new A03_ReverseLinkedList();

        while(true){
        System.out.println("\n1.Insert \n2.display \n3.Dispaly Reversed \n4.Exit");
        int choice = sc.nextInt();
        if(choice==4) {
            System.out.println("Exiting..");
        }
        switch (choice) {
            case 1:
                int val = sc.nextInt();
                list.insertAtEnd(val);
                break;

            case 2:
                list.display();
                break;

            case 3:
                list.reversedLikedList();
                System.out.println();
                list.display();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        }
    }
}
