package Basic.Recursion;

import java.util.Scanner;

public class A7_PalimdromeCheck {
    public static boolean palindromeCheck(String s, int i, int n) {
        if (i >= n / 2) return true;
        if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        return palindromeCheck(s, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        boolean ans = palindromeCheck(str,0,str.length());
        System.out.println(ans);
    }
}
