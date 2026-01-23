package Array;

import java.util.Scanner;

public class A2_Second_Largest {

    public static void SecondLargest(int [] arr){
        int max = arr[0];
        int max2 = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Second Largest: "+max2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        SecondLargest(arr);
    }
}
