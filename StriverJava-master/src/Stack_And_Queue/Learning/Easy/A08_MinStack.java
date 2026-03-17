package Stack_And_Queue.Learning.Easy;

import java.util.Scanner;
import java.util.Stack;

public class A08_MinStack {
    Stack<int[]> st;
    private A08_MinStack() {
        st = new Stack<>();
    }

    private void push(int val) {
        if(st.isEmpty()) st.push(new int[]{val,val});
        else{
            int min = Math.min(getMin(),val);
            st.push(new int[]{val,min});
        }
    }

    private int pop() {
        return st.pop()[0];
    }

    private int top() {
        return st.peek()[0];
    }

    private int getMin() {
        return st.peek()[1];
    }

    public static void main(String[] args) {
        A08_MinStack stack = new A08_MinStack();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\nChoose operation:");
            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Top");
            System.out.println("4 isEmpty");

            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter value: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    System.out.println("Poped element: " + stack.pop());
                    break;

                case 3:
                    System.out.println("Top element: " + stack.top());
                    break;

                case 4:
                    System.out.println("Minimum element: "+stack.getMin());
            }
        }
    }
}
