package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A5_FloorAndCeil {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int floor = -1;
        int ceil = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==x){
                floor = nums[mid];
                ceil = nums[mid];
                break;
            }
            else if(nums[mid]<x){
                floor = nums[mid];
                low = mid +1;
            }
            else{
                ceil = nums[mid];
                high = mid -1;
            }
        }
        return new int[] {floor,ceil};
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
        int [] result = getFloorAndCeil(arr,target);
        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}
