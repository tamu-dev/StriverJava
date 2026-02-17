package String;

import java.util.Scanner;

public class A04_LogestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        if(str.length == 0){
            return "";
        }
        String first = str[0];
        for(int i = 0; i<first.length();i++){
            char ch = first.charAt(i);
            for(int j=1;j< str.length;j++){
                if(i>=str[j].length() || str[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String size= ");
        int n = sc.nextInt();
        sc.nextLine();

        String [] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextLine();
        }


        String result = longestCommonPrefix(s);
        System.out.print("result= "+result);

    }
}
