package String;

import java.util.Scanner;

public class A02_ReverseTheWordsInSentence {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        int start = 0 , end = words.length -1;
        while(start<end){
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string= ");
        String s = sc.nextLine();

        String result = reverseWords(s);
        System.out.print("result= "+result);
    }
}
