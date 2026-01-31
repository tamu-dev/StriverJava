package Basic.Recursion;

import java.util.Scanner;

public class A5_FibonacciNumber {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fib(n-1);
        int secLast = fib(n-2);
        return last + secLast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        int result = fib(num);
        System.out.println(result);
    }
}
