package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Scanner;

public class A04_MinDaysBouquets {
    private static boolean isPossible(int [] bloomday,int day,int m,int k){
        int count = 0;
        int bouquets = 0;
        for(int bloom : bloomday){
            if(bloom <= day) {
                count ++;
                if(count == k) {
                    bouquets++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }
        return bouquets >= m;
    }
    public static int roseGarden(int[] nums, int k, int m) {
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for(int bloom : nums){
            minDay = Math.min(bloom , minDay);
            maxDay = Math.max(bloom , maxDay);
        }
        int low = minDay , high = maxDay, result = -1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(isPossible(nums,mid,m,k)){
                result = mid;
                high = mid -1 ;
            }else{
                low = mid +1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Bouquets Number: ");
        int m = sc.nextInt();

        System.out.print("Enter Adjacent Flowers");
        int k = sc.nextInt();

        int result = roseGarden(arr, k, m);
        if (result == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + result);
    }
}
