package Stack_And_Queue.Learning.Easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A03_StackUsingQueues{
    Queue<Integer> q = new LinkedList<>();

    private void push(int x) {
        q.add(x);
        int size = q.size();
        for(int i = 0;i<size-1;i++){
            q.add(q.remove());
        }
    }

    private int pop() {
        return q.remove();
    }

    private int top() {
        return q.peek();
    }

    private boolean empty() {
        return q.isEmpty();
    }

    private int size(){
        return q.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A03_StackUsingQueues stack = new A03_StackUsingQueues();

        int n = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int op = sc.nextInt();

            if(op == 1){
                System.out.print("Add number: ");
                int num = sc.nextInt();
                stack.push(num);
            }

            else if(op == 2){
                System.out.println("Poped number: " +stack.pop());
            }

            else if (op == 3){
                System.out.println("Number at top: " +stack.top());
            }

            else if(op == 4){
                System.out.println(stack.empty());
            }

            else if(op == 5){
                System.out.println("Size of the stack: "+stack.size());
            }
        }
    }
}
