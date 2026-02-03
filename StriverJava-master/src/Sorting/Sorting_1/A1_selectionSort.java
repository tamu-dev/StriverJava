package Sorting.Sorting_1;

import java.util.Scanner;

public class A1_selectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;


            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
    }
}