package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Scanner;

public class A12_MedianOfArrays {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int n = nums1.length;
            int m = nums2.length;

            int[] merged = new int[n + m];

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < n && j < m) {

                if(nums1[i] < nums2[j]) {
                    merged[k] = nums1[i];
                    i++;
                } else {
                    merged[k] = nums2[j];
                    j++;
                }

                k++;
            }

            while(i < n) {
                merged[k] = nums1[i];
                i++;
                k++;
            }
            while(j < m) {
                merged[k] = nums2[j];
                j++;
                k++;
            }

            int size = n + m;
            if(size % 2 == 1) {
                return merged[size / 2];
            }
            return (merged[size / 2] + merged[(size / 2) - 1]) / 2.0;
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

        System.out.println("The answer is "+findMedianSortedArrays(arrOne,arrTwo));
    }
}
