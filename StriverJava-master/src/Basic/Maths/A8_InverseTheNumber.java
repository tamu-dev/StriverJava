package Basic.Maths;

import java.util.Scanner;

public class A8_InverseTheNumber {
    public static int inverseNumber(int x){
        int inv = 0;
        int op = 1;
        while(x !=0){
            int od = x % 10;
            int id = op;
            int ip = od;

            inv = inv + id*(int)Math.pow(10,ip-1);
            x= x/10;
            op++;
        }
        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println(inverseNumber(num));
    }
}
