package Basic.Maths;

import java.util.Scanner;

public class A5_ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n>0){
            int digit = n % 10;
            sum +=digit * digit * digit;
            n/=10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(isArmstrong(num)){
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armstrong");
        }
    }
}
