package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A7_CountOccurrence {
    public static int lowerBound(int[] nums,int n, int x) {
        int low =0;
        int high = n-1;
        int ans = n ;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] nums,int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int countOccurrences(int[] arr,int n, int target) {
        int lb = lowerBound(arr,n, target);
        int ub = upperBound(arr,n,target);
        int ans = ub - lb;
        return ans;
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
        int result = countOccurrences(arr,n,target);
        System.out.println(result);

    }
}
