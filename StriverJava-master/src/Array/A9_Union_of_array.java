package Array;

import java.util.HashSet;
import java.util.Scanner;

public class A9_Union_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array size ");
        int n = sc.nextInt();


        System.out.println("Elements of first array");
        int [] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Elements of second array");
        int [] arr2 = new int[n];
        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        HashSet <Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            set.add(num);
        }

        System.out.print("[");
        for(int num:set){
            System.out.print(num+" ");
        }
        System.out.print("]");
    }
}
