package Basic.Maths;

import java.util.Scanner;

public class A3_palindromeNumber {
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while(n != 0){

            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;     //Don't take directly the n value as it changes after one loop itteration
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
