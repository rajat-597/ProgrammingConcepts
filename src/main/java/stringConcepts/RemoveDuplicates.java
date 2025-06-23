package stringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder removeDuplicate = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();
        for(char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);

            // Only append if it's the first time this char is seen
            if(map.get(c) == 1){
                removeDuplicate.append(c);
        }

        }
        System.out.println(removeDuplicate.toString());

    }
}
