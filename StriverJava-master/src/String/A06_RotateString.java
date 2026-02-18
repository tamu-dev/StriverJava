package String;

import java.util.Scanner;

public class A06_RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String temp = s + s;
        return temp.contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string= ");
        String s = sc.nextLine();

        System.out.println("Enter goal string:");
        String goal = sc.nextLine();

        boolean result = rotateString(s,goal);
        System.out.print("result= "+result);
    }
}
