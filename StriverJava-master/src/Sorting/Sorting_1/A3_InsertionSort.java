package Sorting.Sorting_1;

import java.util.Scanner;

public class A3_InsertionSort {
    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for(int i= 0;i<=n-1;i++){
            int j = i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
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
        insertionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
