package Basic.Recursion;

import java.util.Scanner;

public class A4_FactorialOfNumber {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println(result);
    }
}
