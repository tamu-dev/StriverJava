package Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class A02_StockExchange {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        for(int i=1; i<n;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            if(prices[i]>buy){
                int diff = prices[i] - buy;

                if(diff>profit){
                    profit = diff;
                }
            }

        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = maxProfit(arr);
        System.out.println("Maximum profit "+result);
    }
}
