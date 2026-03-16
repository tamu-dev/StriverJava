package Stack_And_Queue.Learning.Easy;

import java.util.Scanner;
import java.util.Stack;

public class A07_BalancedParantheses {
    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;

                char top = st.pop();
                if((ch == ')' && top == '(')||
                        (ch == '}' && top == '{')||
                        (ch == ']' && top == '['))
                    continue;
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the set of parantheses");
        String br = sc.next();

        System.out.println(isValid(br));
    }
}
