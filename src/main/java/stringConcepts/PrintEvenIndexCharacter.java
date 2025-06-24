package stringConcepts;

import java.util.Scanner;

public class PrintEvenIndexCharacter {
    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(int i=0; i<=input.length()-1 ; i++){
            char ch = input.charAt(i);
            if(i%2 ==0){
                System.out.println("Even Indexed Characters are "+ ch);
            }
        }

    }
}
