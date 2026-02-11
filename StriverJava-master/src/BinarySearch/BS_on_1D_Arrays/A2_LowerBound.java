package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A2_LowerBound {
    public static int lowerBound(int[] nums, int x) {
        int n = nums.length;
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
        int result = lowerBound(arr,target);
        System.out.println(result);
    }
}
