package stringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occurrencesOfCharacter {

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<Character, Integer> count = new HashMap<>();
        for(char c : input.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        // iterate through map
        for(Map.Entry<Character, Integer> counts: count.entrySet()){
            System.out.println(counts.getKey() + " and their counts are " + counts.getValue() );
        }


    }
}
