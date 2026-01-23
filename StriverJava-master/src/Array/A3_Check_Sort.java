package Array;

import java.util.Scanner;

public class A3_Check_Sort {
    public static void CheckSort(int [] arr){
        boolean ascending = true , descending = true;

        for(int i = 0; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                System.out.println("Acsending sorted");
            } else if (arr[i] < arr[i+1]) {
                System.out.println("Descending sorted");
            }else {
                System.out.println("Not sorted");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        CheckSort(arr);


    }
}
