package Array;

import java.util.Arrays;
import java.util.Scanner;

public class A16_MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        int actualSum = (n*(n+1)/2);
        int digit = actualSum - sum;
        return digit;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = missingNumber(arr);
        System.out.println(result);
    }
}
