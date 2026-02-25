package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A01_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(nums[i],i);
        }
        return new int [0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
}
