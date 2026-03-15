package Stack_And_Queue.Learning.Easy;

import java.util.Scanner;

public class A02_ArrayQueue {

    private int[] QueueArray;
    int start, end;
    int currentSize, maxSize;

    private A02_ArrayQueue() {
        QueueArray = new int[10];
        start = -1;
        end = -1;
        currentSize = 0;
        maxSize = 10;
    }

    private void push(int x) {
        if (currentSize == maxSize) {
            System.out.println("Queue is full");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxSize;
        }
        QueueArray[end] = x;
        currentSize++;
    }

    private int pop() {
        if (start == -1) {
            System.out.println("Queue is empty");
            System.exit(1);
        }
        int popped = QueueArray[start];

        if (currentSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxSize;
        }
        currentSize--;
        return popped;
    }

    private int peek() {
        if (start == -1) {
            System.out.println("Queue is empty");
            System.exit(1);
        }
        return QueueArray[start];
    }

    private boolean isEmpty() {
        return currentSize == 0;
    }

    public static void main(String[] args) {
        A02_ArrayQueue qu = new A02_ArrayQueue();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nChoose operation:");
            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Peek");
            System.out.println("4 isEmpty");

            int choice = sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("Enter value: ");
                    int val = sc.nextInt();
                    qu.push(val);
                    break;

                case 2:
                    System.out.println("Poped element: "+qu.pop());
                    break;

                case 3:
                    System.out.println("Top element: "+qu.peek());
                    break;

                case 4:
                    System.out.println("It is empty: "+qu.isEmpty());
                    break;

            }
        }
    }
}
