package BinarySearch.BS_on_1D_Arrays;

import java.util.Scanner;

public class A9_SearchInRotatedArray_II {
    public static boolean searchInARotatedSortedArrayII(int[] nums,int n, int k) {
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(k == nums[mid]){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            else if(nums[low]<=nums[mid]){
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
        return false;
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
        boolean result = searchInARotatedSortedArrayII(arr,n,target);
        System.out.println(result);

    }
}
