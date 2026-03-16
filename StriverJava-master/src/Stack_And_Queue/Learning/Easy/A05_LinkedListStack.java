package Stack_And_Queue.Learning.Easy;

import java.util.Scanner;

public class A05_LinkedListStack {
    private Node head;
    int size;
    private A05_LinkedListStack() {
        head = null;
        size = 0;
    }

    private void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    private int pop() {
        if(head == null) return -1;

        int value = head.val;
        head = head.next;
        size--;
        return value;
    }

    private int top() {
        if(head == null) return -1;
        return head.val;
    }

    private boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {
        A05_LinkedListStack stack = new A05_LinkedListStack();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nChoose operation:");
            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Top");
            System.out.println("4 isEmpty");

            int choice = sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("Enter value: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    System.out.println("Poped element: "+stack.pop());
                    break;

                case 3:
                    System.out.println("Top element: "+stack.top());
                    break;

                case 4:
                    System.out.println("It is empty: "+stack.isEmpty());
                    break;

            }
        }
    }
}
