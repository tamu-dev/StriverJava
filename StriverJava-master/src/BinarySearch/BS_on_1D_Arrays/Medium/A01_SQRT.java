package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Scanner;

public class A01_SQRT {
    public static int floorSqrt(int n) {
        int low = 1;
        int high = n/2;
        int ans = 0;
        while(low <= high){
            long mid = low+(high-low)/2;
            if(mid * mid <= n){
                ans =(int) mid;
                low =(int) mid +1;
            }
            else{
                high =(int) mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = floorSqrt(n);
        System.out.println(result);
    }
}
