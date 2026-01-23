package Basic.Maths;

import java.util.Scanner;

public class A2_reverseNumber {
    public static int reverseNumber(int n) {
        int reverse = 0;
        while(n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int result = reverseNumber(num);
        System.out.println(result);
    }
}
