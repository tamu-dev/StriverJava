package BinarySearch.BS_on_1D_Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class A12_SingleOccurrenceNumber {
    public static int singleNonDuplicate(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("single element is "+singleNonDuplicate(arr));
    }
}
