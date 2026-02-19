package String;

import java.util.Scanner;

public class A07_AnagramString {
    public static boolean isAnagram(String s, String t) {
        int []arr = new int[26];
        char []sarr = s.toCharArray();
        for (char c : sarr){
            arr[c - 'a'] +=1;
        }
        char []tarr = t.toCharArray();
        for (char c : tarr){
            arr[c - 'a'] -=1;
        }
        for (int a : arr){
            if (a!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string= ");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        System.out.println(isAnagram(s,t));
    }
}
