package Stack_And_Queue.Learning.Easy;

import java.util.Scanner;
import java.util.Stack;

class A04_StackQueue {
    private Stack<Integer> input,output;
    private A04_StackQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    private void push(int x) {
        input.push(x);
    }

    private int pop() {
        if(output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        if(output.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return output.pop();
    }

    private int peek() {
        if(output.isEmpty()){
            output.push(input.pop());
        }

        if(output.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return output.peek();
    }

    private boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A04_StackQueue qu = new A04_StackQueue();

        while(true){
            System.out.println("\nChoose operation:");
            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Peek");
            System.out.println("4 isEmpty");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter value: ");
                    int val = sc.nextInt();
                    qu.push(val);
                    break;

                case 2:
                    System.out.println("Popped element: "+qu.pop());
                    break;

                case 3:
                    System.out.println("Peek element: "+qu.peek());
                    break;

                case 4:
                    System.out.println("It is empty: "+qu.isEmpty());
                    break;
            }
        }
    }
}
