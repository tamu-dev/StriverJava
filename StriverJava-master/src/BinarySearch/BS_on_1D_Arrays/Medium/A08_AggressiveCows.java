package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A08_AggressiveCows {
    private static boolean canWePlace(int [] stalls,int cow,int d){
        int count = 1;
        int lastPos = stalls[0];

        for(int i=1; i<stalls.length;i++){
            if(stalls[i] - lastPos >= d){
                count++;
                lastPos = stalls[i];
            }
            if(count >= cow) return true;
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int cow) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length-1]- stalls[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canWePlace(stalls,cow,mid)){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter number of cows");
        int k = sc.nextInt();

        System.out.println("maximum possible minimum distance "+aggressiveCows(arr,k));
    }
}
