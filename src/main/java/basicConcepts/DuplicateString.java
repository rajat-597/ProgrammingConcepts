package basicConcepts;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String[] args) {

        String name = "Rajatt";
        name = name.toLowerCase();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(char input : name.toCharArray()){
            hm.put(input, hm.getOrDefault(input,0)+1);
        }
        // iterate the HashMap

        for(Map.Entry<Character, Integer> data : hm.entrySet()){
            if(data.getValue()>1){
                System.out.println(data.getKey());

            }
        }

    }
}
