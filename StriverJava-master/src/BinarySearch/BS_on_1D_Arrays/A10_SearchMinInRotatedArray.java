package BinarySearch.BS_on_1D_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class A10_SearchMinInRotatedArray {
    public int findMin(ArrayList<Integer> arr) {
        int  low = 0;
        int  high = arr.size()-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr.get(mid) > arr.get(high)){
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return arr.get(low);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Array size: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        A10_SearchMinInRotatedArray obj = new A10_SearchMinInRotatedArray();
        int result = obj.findMin(list);
        System.out.println("Minimun number is: "+result);
    }
}
