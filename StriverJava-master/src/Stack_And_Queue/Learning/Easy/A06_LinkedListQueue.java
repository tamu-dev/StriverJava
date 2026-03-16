package Stack_And_Queue.Learning.Easy;

import java.util.Scanner;

public class A06_LinkedListQueue {
    private Node start;
    private Node end;
    private int size;

    private A06_LinkedListQueue() {
        start = end = null;
        size = 0;
    }

    private void push(int x) {
        Node temp = new Node(x);
        if(start == null){
            start = end = temp;
        }
        else{
            end.next = temp;
            end = temp;
        }
        size++;
    }

    private int pop() {
        if(start == null) return -1;

        int val = start.val;
        start = start.next;
        size--;

        return val;
    }

    private int peek() {
        if(start==null) return -1;
        return start.val;
    }

    private boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {
        A06_LinkedListQueue stack = new A06_LinkedListQueue();
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
                    System.out.println("Top element: "+stack.peek());
                    break;

                case 4:
                    System.out.println("It is empty: "+stack.isEmpty());
                    break;

            }
        }
    }
}
