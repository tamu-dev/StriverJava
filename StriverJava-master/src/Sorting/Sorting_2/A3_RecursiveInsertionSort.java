package Sorting.Sorting_2;

import java.util.Scanner;

public class A3_RecursiveInsertionSort {
    public static int[] insertionSort(int[] arr,int n,int i) {
        if (i == n) return arr;

        int j = i;

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertionSort(arr, n, i+1);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr,n,0);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
