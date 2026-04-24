package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A03_KokoBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = maxPile;
        int ans =maxPile;
        while(low<=high){
            int mid = low+(high-low)/2;
            long totalHrs = totalHours(piles,mid);
            if(totalHrs <= h){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    private static long totalHours(int [] arr,int s){
        long totalH = 0;
        for (int bananas : arr) {
            totalH += (int)(bananas + s - 1) / s;
        }
        return totalH;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter Hours: ");
        int h = sc.nextInt();
        int result = minEatingSpeed(arr,h);
        System.out.println(result);
    }
}
