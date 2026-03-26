package Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A03_SortZeroOneTwo {
    public static int[] sortZeroOneTwo(int[] nums) {
        int l = 0;
        int mid = 0;
        int n = nums.length -1;

        while(n >= mid){
            if(nums[mid] == 0){
                int temp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = temp;
                l++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else{
                int temp = nums[n];
                nums[n] = nums[mid];
                nums[mid] = nums[n];
                n--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>2){
                System.out.println("Invalid input");
                return;
            }
        }

        int [] result = sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(result));
    }
}
