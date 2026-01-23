package Basic.Maths;

import java.util.Scanner;

public class A1_countDigits {
    public static int countDigit(int n) {
        int cnt = 0;
        while(n!=0){
            n /= 10;
            cnt++;
        }
        return cnt;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int result = countDigit(num);
        System.out.println(result);
    }
}
