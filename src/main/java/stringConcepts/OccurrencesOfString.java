package stringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrencesOfString {

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        Map<String,Integer> countString = new HashMap<>();
        for(String s : value.split("\\s+")){
            String word = s.toLowerCase();
            countString.put(word,countString.getOrDefault(word,0)+1);
        }


        // Iterate over Map
        for(Map.Entry<String, Integer> words : countString.entrySet()){
            System.out.println(words.getKey() + " occurrence is " + words.getValue());
        }
    }

}
