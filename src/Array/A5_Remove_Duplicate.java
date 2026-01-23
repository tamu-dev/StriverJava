package Array;

import java.util.HashSet;
import java.util.Scanner;

public class A5_Remove_Duplicate {
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
            HashSet <Integer> set = new HashSet<>();
            for(int i = 0; i<n;i++){
                if(!set.contains(arr[i])){
                    set.add(arr[i]);
                }

            }
            System.out.print(set+" ");
            System.out.println("\t");



            System.out.println("enter 1 to contunue");
            choice = sc.nextInt();
        }

    }
}
