package Array;

import java.util.Scanner;

public class A1_Largest_Element {

    static int checklarge(int [] arr){

        int max = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest: " + max);
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int largest = checklarge(arr);

    }
}
