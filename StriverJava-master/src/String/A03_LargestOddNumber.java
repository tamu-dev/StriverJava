package String;

import java.util.Scanner;

public class A03_LargestOddNumber {
    public static String largeOddNum(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);

            int digit = ch - '0';
            if(digit %2 != 0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string= ");
        String s = sc.nextLine();

        String result = largeOddNum(s);
        System.out.print("result= "+result);

    }
}
