package basicConcepts;

import java.util.HashMap;

public class Practice01 {

    // remove duplicate
    public static void main(String[] args) {

        String input = "Rajat Kumar Sahoo";  // Rajt kumr Sho

        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> data = new HashMap<>();
        for(char ch : input.toCharArray()) {
            data.put(ch, data.getOrDefault(ch, 0) + 1);
            if(data.get(ch) == 1){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

    }
}
