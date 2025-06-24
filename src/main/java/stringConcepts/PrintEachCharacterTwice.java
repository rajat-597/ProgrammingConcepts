package stringConcepts;

import java.util.Scanner;

public class PrintEachCharacterTwice {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(char ch : input.toCharArray()){
            sb.append(ch).append(ch);
        }
        System.out.println("Print Each Character Twice " + sb.toString());
    }
}
