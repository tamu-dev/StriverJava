package Basic.Recursion;

import java.util.Scanner;

public class A3_SumofNnumber {
    public static int NnumbersSum(int n) {
        if(n==0){
           return 0;
        }
        return n + NnumbersSum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(NnumbersSum(num));
    }
}
