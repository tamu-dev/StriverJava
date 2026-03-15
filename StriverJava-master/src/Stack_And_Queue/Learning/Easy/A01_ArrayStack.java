package Stack_And_Queue.Learning.Easy;

import java.util.Scanner;

public class A01_ArrayStack {
    private int [] StackArrays;
    private int capacity;
    private int topIndex;

    private A01_ArrayStack(int size){
        capacity = size;
        topIndex = -1;
        StackArrays = new int [capacity];
    }

    private A01_ArrayStack() {
        this(1000);
    }

    private void push(int x) {
        if(topIndex >= capacity -1){
            System.out.println("Stack overflow");
        }
        StackArrays [++topIndex] = x;
    }

    private int pop() {
        if(isEmpty()) return -1;
        return StackArrays [topIndex--];
    }

    private int top() {
        if(isEmpty()) return -1;
        return StackArrays[topIndex];
    }

    private boolean isEmpty() {
        return topIndex == -1;
    }


    public static void main(String[] args) {
        A01_ArrayStack stack = new A01_ArrayStack();
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
                    System.out.println("Poped element: ");
                    stack.pop();
                    break;

                case 3:
                    System.out.println("Top element: ");
                    stack.top();
                    break;

                case 4:
                    System.out.println("It is empty: ");
                    stack.isEmpty();
                    break;

            }
        }


    }
}
