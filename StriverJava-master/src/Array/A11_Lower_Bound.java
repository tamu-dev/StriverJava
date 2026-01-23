package Array;

import java.util.Scanner;

public class A11_Lower_Bound {
    public static int lowerBound(int[] arr, int x) {
        int low=0,high= arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;   //may be an ans
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Array size= ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("target element = ");
        int x = sc.nextInt();

        int result = lowerBound(arr,x);

        System.out.println(result);


    }
}
