package Basic.Maths;

import java.util.Scanner;

public class A7_CheckPrime {
    public static boolean isPrimeNumber(int n){
        int cnt = 0;
        for(int i=1; i*i<= n; i++){
            if(n%i==0){
                cnt++;
                if(n/i != i){
                    cnt++;
                }
            }
        }
        if(cnt == 2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the NUmber");
        int num = sc.nextInt();

        if(isPrimeNumber(num)){
            System.out.println("prime number");
        }else{
            System.out.println("not prime");
        }
    }
}
