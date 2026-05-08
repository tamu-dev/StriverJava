package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A05_SmallestDivisor {
    public static int smallestDivisor(int[] nums, int limit) {
        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();
        int low = 1;
        int high = max;
        while(low <= high){
            int mid = low + (high -low)/2;
            int sum = 0;
            for(int i = 0;i<n;i++){
                int div = (nums[i] + mid-1)/mid;
                sum += div;
            }
            if(sum > limit){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("limit is: ");
        int m = sc.nextInt();

        int result = smallestDivisor(arr, m);
        System.out.print("Smallest Divisor is: "+result);
    }
}
