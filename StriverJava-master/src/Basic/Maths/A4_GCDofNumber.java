package Basic.Maths;

import java.util.Scanner;

public class A4_GCDofNumber {
    public static int GCD(int n1, int n2) {
        while(n2 != 0){
            int temp = n2;
            n2 =n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int a= sc.nextInt();

        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        int result = GCD(a,b);
        System.out.println(result);
    }
}
