package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Scanner;

public class A07_MissingNumber {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int missing = arr[mid] - (mid +1);
            if(missing < k) low = mid +1;
            else{
                high = mid -1 ;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter Index Position: ");
        int k = sc.nextInt();

        System.out.println(findKthPositive(arr,k));
    }
}
