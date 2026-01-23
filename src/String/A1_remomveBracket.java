package String;

import java.util.Scanner;

public class A1_remomveBracket {
    public static  String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count!=0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                count++;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string= ");
        String s = sc.nextLine();

        String result = removeOuterParentheses(s);
        System.out.print("result= "+result);

    }
}
