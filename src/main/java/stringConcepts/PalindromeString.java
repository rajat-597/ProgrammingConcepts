package stringConcepts;

import java.util.Scanner;

public class PalindromeString {

 public static void main(String[] args) {
  System.out.println("Enter a String ");
  Scanner sc = new Scanner(System.in);
  String value = sc.nextLine();
  boolean flag = isPalindrome(value);
  if(flag == true){
   System.out.println("The Given String is Palindrome ");
  }else {
   System.out.println("Not palindrome");
  }
 }

 public static boolean isPalindrome(String input) {
  int i = 0, j = input.length() - 1;
  while (i < j) {
   if (input.charAt(i) != input.charAt(j)) {
       return false;
   }
      i++;
      j--;
  }
       return true;
 }
}
