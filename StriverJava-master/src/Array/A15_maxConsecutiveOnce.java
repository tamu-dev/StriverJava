package Array;

import java.util.Scanner;

public class A15_maxConsecutiveOnce {
    public static int findMaxConsecutiveOnes(int[] arr , int n ) {
        int ans = 0;
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==1){
                count++;
                ans = Math.max(ans, count);  // Math.max saves the max value
            }else{
                count =0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array size");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = findMaxConsecutiveOnes(arr,n);
        System.out.println(result);
    }
}
