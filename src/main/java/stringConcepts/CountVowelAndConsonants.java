package stringConcepts;

import java.util.Scanner;

public class CountVowelAndConsonants {

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for(int i=0;i<input.length()-1;i++){
            char ch = input.charAt(i);

            // Note: for above 2 lines we can write for(char ch : input.toCharArray)

            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels count are  "+ vowels);
        System.out.println("Consonants count are " + consonants);

    }
}

