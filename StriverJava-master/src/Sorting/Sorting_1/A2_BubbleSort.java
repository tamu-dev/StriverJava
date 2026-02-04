package Sorting.Sorting_1;

import java.util.Scanner;

public class A2_BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            boolean didSwap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
    }
}
