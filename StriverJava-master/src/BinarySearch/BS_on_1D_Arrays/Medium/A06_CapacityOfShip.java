package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A06_CapacityOfShip {
    public static int days(int [] weight, int capacity){
        int day = 1;
        int currentLoad = 0;
        for(int w : weight){
            if(currentLoad + w > capacity){
                day++;
                currentLoad = w;
            }else{
                currentLoad += w;
            }
        }
        return day;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while(low <= high){
            int mid = low + (high - low)/2;
            int needed = days(weights,mid);
            if(needed <= days) high = mid - 1;
            else{
                low = mid +1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Number of Days: ");
        int day = sc.nextInt();

        int result = shipWithinDays(arr,day);
        System.out.println(result);
    }
}

