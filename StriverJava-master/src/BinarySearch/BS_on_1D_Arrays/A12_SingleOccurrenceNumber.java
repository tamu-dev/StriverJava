package BinarySearch.BS_on_1D_Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class A12_SingleOccurrenceNumber {
    public static int singleNonDuplicate(int[] nums) {
//        BruteForce
//        HashMap <Integer,Integer> map = new HashMap<>();
//        for(int i : nums){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        for(int key : map.keySet()){
//            if(map.get(key)==1){
//                return key;
//            }
//        }
//        return 0;

//        optimal
        int n = nums.length;
        if (n==1) {return nums[0];}

        if(nums[0] != nums[1]) {return nums[0];}
        if(nums[n-1] != nums[n-2]) {return nums[n-1];}
        int low = 1 , high = n-2;
        while(low<=high){
            int mid = low+(high - low)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if((mid%2==1 && nums[mid] == nums[mid-1]) || ( mid%2==0 && nums[mid] == nums[mid+1])){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
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
