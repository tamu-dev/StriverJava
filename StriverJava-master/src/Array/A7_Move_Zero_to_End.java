package Array;

import java.util.Scanner;

public class A7_Move_Zero_to_End {

    public static void MoveZeroes(int [] arr){
        int n = arr.length;
        int temp = 0; // position for non-zero elements

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[temp] = arr[i];
                temp++;
            }
        }

        // Step 2: Fill remaining positions with zero
        while (temp < n) {
            arr[temp] = 0;
            temp++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size= ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        MoveZeroes(arr);

        System.out.println("\nAfter moving zeroes:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
