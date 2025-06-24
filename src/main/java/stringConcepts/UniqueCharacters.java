package stringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacters {
    // Java Automation     jav Automin
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> uniqueCharacter = new HashMap<>();
        for(char ch : input.toCharArray()){
            uniqueCharacter.put(ch,uniqueCharacter.getOrDefault(ch,0)+1);
            if(uniqueCharacter.get(ch) ==1){
                sb.append(ch);
            }
        }
        System.out.println("Unique Characters " + sb.toString());
    }
}
