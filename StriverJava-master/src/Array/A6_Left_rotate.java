package Array;

import java.util.Scanner;

public class A6_Left_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1;
        while (choice == 1) {
            System.out.println("Array size: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("\nLeft rotate array");
            int d = sc.nextInt();

            d = d % n;

            int [] temp = new int [n];
            for(int i = 0 ; i<n; i++){
                temp[i] = arr[(i + d)% n];
            }
            System.out.println(temp);

            for(int num : temp){
                System.out.println(num+" ");
            }
            System.out.println("\n");
            System.out.println("enter 1 to continue");
            choice = sc.nextInt();
        }
    }
}
