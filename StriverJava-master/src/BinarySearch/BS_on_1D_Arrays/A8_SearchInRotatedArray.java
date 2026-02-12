package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A8_SearchInRotatedArray {
    public static int search(int[] nums,int n, int k) {
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(k == nums[mid]){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=k && k<=nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if(k>=nums[mid] && k<=nums[high]){
                    low = mid+1;
                }else{
                    high = mid -1;
                }
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

        System.out.print("target element = ");
        int target = sc.nextInt();
        int result = search(arr,n,target);
        System.out.println(result);

    }
}
