package stringConcepts;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder removedSpaces = new StringBuilder();
        for(int i= 0; i<input.length()-1; i++){
            if(input.charAt(i) != ' '){
                removedSpaces.append(input.charAt(i));
            }
        }
        System.out.println("After Removing Strings "+ removedSpaces.toString());
    }
}
