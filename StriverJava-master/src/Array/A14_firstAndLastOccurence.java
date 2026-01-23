package Array;

import java.util.Scanner;
import java.util.Arrays;

public class A14_firstAndLastOccurence {
    public static int lowerBound(int[] arr, int x) {
        int low=0,high= arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int[] searchRange(int[] arr, int x) {
        int lb = lowerBound(arr, x);
        int ub = upperBound(arr, x);
        if(lb == arr.length || arr[lb] != x){
            return new int []  {-1,-1};
        }
        return new int [] {lb,ub-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("array size");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("target element = ");
        int x = sc.nextInt();

        int [] result = searchRange(arr,x);
        System.out.println(Arrays.toString(result));
    }
}
