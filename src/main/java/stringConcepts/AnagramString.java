package stringConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {
        System.out.println("Enter First String");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();

        System.out.println("Enter Second String");
        Scanner scanner = new Scanner(System.in);
        String input2 = scanner.nextLine();

       boolean flag =  checkAnagram(input1, input2);
       if(flag == true){
           System.out.println("The given Strings are anagrams");
       }else {
           System.out.println("Not Anagram");
       }
    }

    public static boolean checkAnagram(String str1, String str2){
        char [] a = str1.replaceAll("\\s","").toLowerCase().toCharArray();
        char [] b = str2.replaceAll("\\s","").toLowerCase().toCharArray();

        // Sorting the Arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Comparing two arrays
        return Arrays.equals(a,b);
    }
}
