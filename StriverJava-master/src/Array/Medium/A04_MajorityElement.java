package Array.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class A04_MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        int result = -1;
        for(int key : map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq = map.get(key);
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = majorityElement(arr);
        System.out.println(result);
    }
}
