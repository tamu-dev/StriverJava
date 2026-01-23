package Array;

import java.util.Scanner;

public class A4_Left_Rotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter left rotation: ");
        int d = sc.nextInt();
        d = d % n;

        int [] temp = new int[n];

        for(int i = 0; i< n; i++){
            temp[i] = arr[(i+d) % n];
        }
        System.out.println(temp);

        for(int num : temp){
            System.out.print(num+" ");
        }


    }
}
