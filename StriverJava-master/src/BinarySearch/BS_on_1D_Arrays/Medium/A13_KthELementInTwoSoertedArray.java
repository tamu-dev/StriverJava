package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A13_KthELementInTwoSoertedArray {
    public static int kthElement(int[] a, int[] b, int target) {
        int n = a.length;
        int m = b.length;

        int[] merged = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m) {

            if(a[i] < b[j]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }

            k++;
        }

        while(i < n) {
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j < m) {
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged[target - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Array size: ");
        int n = sc.nextInt();
        int [] arrOne = new int[n];

        for(int i=0;i<n;i++){
            arrOne[i] = sc.nextInt();
        }

        System.out.print("Enter the first Array size: ");
        int m = sc.nextInt();
        int [] arrTwo = new int[m];

        for(int i=0;i<m;i++){
            arrTwo[i] = sc.nextInt();
        }

        System.out.println("Enter the target index");
        int k = sc.nextInt();

        System.out.println("The answer is "+kthElement(arrOne,arrTwo,k));
    }

}
