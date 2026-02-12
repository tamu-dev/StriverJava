package BinarySearch.BS_on_1D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A6_FirstAndLastOccurrence {
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
    public static int[] searchRange(int[] nums,int n, int target) {
        int lb = lowerBound(nums,n,target);
        if(lb == n || nums[lb] != target) return new int[]{-1, -1};
        return new int[]{lb, upperBound(nums, n, target) - 1};
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
        int [] result = searchRange(arr,n,target);
        System.out.println(Arrays.toString(result));
    }
}
