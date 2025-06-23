package stringConcepts;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String revStr = "";
        for(int i= input.length()-1; i>=0; i--){
            char ch = input.charAt(i);
            revStr = revStr + ch ;
        }
        System.out.println("Reversed String is " + revStr);
    }
}
