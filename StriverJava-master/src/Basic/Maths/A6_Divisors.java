package Basic.Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A6_Divisors {
    public static int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i*i<=n;i++){
            if(n % i ==0){
                list.add(i);

                if(i != n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        int [] divisor = new int [list.size()];
        for(int i = 0; i<list.size(); i++){
            divisor[i]=list.get(i);
        }
        return divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        int [] result = divisors(num);
        System.out.println(Arrays.toString(result));
    }
}
