package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A11_BookAllocation {
    private static int countPainters(int [] arr,int k){
        int painters = 1;
        int painterCount = 0;
        for(int i=0;i<arr.length;i++){
            if (painterCount + arr[i] <= k){
                painterCount += arr[i];
            }
            else{
                painters++;
                painterCount = arr[i];
            }
        }
        return painters;
    }
    public static int findPages(int[] nums, int m) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        int result = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            int student = countPainters(nums,mid);
            if(student > m){
                low = mid +1;
            }
            else{
                result = mid;
                high = mid -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter number of students");
        int k = sc.nextInt();

        System.out.println("The answer is "+findPages(arr,k));
    }
}
