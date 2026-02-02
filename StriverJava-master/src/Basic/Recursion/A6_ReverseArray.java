package Basic.Recursion;
import java.util.Scanner;

import static java.util.Collections.swap;

public class A6_ReverseArray {
    public static void reverse(int[] arr, int n,int i) {
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(arr,n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr,arr.length,0);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}

