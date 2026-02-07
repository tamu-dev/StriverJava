package Sorting.Sorting_2;

import java.util.Scanner;

public class A2_RecursiveBubbleSort {
    public static int[] bubbleSort(int[] arr, int n, int i) {
        if(n==1){
            return arr;
        }
        if(i == n-1){
            return bubbleSort(arr,n-1,0);
        }
        if(arr[i]> arr[i+1]){
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;

        }
        return bubbleSort(arr,n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n,0);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
