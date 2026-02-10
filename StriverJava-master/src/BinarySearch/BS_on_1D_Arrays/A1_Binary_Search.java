package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A1_Binary_Search {
    public static int search(int[] nums, int target, int i) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]<target){
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

        System.out.print("target element = ");
        int target = sc.nextInt();
        int result = search(arr,n,target);

        if(result==-1){
            System.out.println("not found");
        }
        else {
            System.out.println(result);
        }
    }
}
