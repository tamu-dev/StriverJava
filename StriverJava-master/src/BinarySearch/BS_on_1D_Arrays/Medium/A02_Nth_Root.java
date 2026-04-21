package BinarySearch.BS_on_1D_Arrays.Medium;

import java.util.Scanner;

public class A02_Nth_Root {
    public static int NthRoot(int N, int M) {
        int low = 1;
        int high = M;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long ans = 1;
            for (int i = 0; i < N; i++) {
                ans *= mid;
                if (ans > M) break;
            }
            if (ans == M) return mid;
            if (ans < M) low = mid + 1;
            else {
                high = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int m = sc.nextInt();
        System.out.print("Enter the root: ");
        int n = sc.nextInt();

        int result = NthRoot(n,m);
        System.out.println(result);
    }
}

