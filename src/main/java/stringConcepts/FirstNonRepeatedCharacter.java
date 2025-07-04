package stringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// int arr[] = {2,4,6,3,7,9}
public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<Character, Integer> nonRepeated = new HashMap<>();
        for(char c: input.toCharArray()){
            nonRepeated.put(c,nonRepeated.getOrDefault(c,0)+1);
        }
        // iterate over Map
        for(Map.Entry<Character, Integer> firstNonRepeated: nonRepeated.entrySet()){
            System.out.println(firstNonRepeated.getKey() + "is occurred " + firstNonRepeated.getValue());
            if(firstNonRepeated.getValue()>1){
                System.out.println("First non repeated character is " + firstNonRepeated.getKey());
                break;
            }
        }
        }
    }

