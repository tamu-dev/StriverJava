package Array;

import java.util.Scanner;

public class A8_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array size ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter element ");
        int num = sc.nextInt();

        for(int i = 0; i<n; i++){
            if (arr[i] == num){
                System.out.println(i);
            }
        }
        System.out.println(num+ " not present");

    }
}
