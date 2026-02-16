package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A13_FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int low=1;
        int high = n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((nums[mid]>nums[mid-1]) && (nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Peak element is at index: "+findPeakElement(arr));
    }
}
