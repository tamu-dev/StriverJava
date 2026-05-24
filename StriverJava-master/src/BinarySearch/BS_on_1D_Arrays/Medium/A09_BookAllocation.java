package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A09_BookAllocation {
    private static int student(int [] arr,int pages){
        int student = 1;
        int pagesStudent = 0;
        for(int i=0;i<arr.length;i++){
            if(pagesStudent + arr[i] <= pages){
                pagesStudent += arr[i];
            }else{
                student++;
                pagesStudent += arr[i];
            }
        }
        return student;
    }
    public static int findPages(int[] nums, int m) {
        int low = Arrays.stream(nums).min().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low <= high){
            int mid = low + (high - low)/2;
            int student = student(nums,mid);
            if(student > m){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
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

        System.out.print("The answer is: "+findPages(arr,k));
    }
}
