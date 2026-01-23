package Array;

import java.util.Scanner;

public class A10_Search_X_Binary_Search {
    public static int binarySearch(int arr[], int n, int target) {

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;

            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("target element = ");
        int target = sc.nextInt();
        int result = binarySearch(arr,n,target);

        if(result==-1){
            System.out.println("not found");
        }
        else {
            System.out.println(result);
        }
    }
}
