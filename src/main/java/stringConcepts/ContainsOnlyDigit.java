package stringConcepts;

import java.util.Scanner;

public class ContainsOnlyDigit {

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean flag = containsDigit(input);
        if (flag == true){
            System.out.println("contains only Digits");
        }else {
            System.out.println("combination of both");
        }
    }

    public static boolean containsDigit(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
