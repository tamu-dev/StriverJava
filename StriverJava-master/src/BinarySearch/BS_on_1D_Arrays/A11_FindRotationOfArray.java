package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A11_FindRotationOfArray {
    public static int findKRotation(int [] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int result = A11_FindRotationOfArray.findKRotation(arr);
        System.out.println(result);
    }
}

