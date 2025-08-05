package basicConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Practice02 {

    // Rajat Kumar Sahoo
    public static void main(String[] args) {

        String input = "Rajat Kumar Sahoo";
        HashMap<Character, Integer> data = new HashMap<>();
        for(char ch : input.toCharArray()){
            data.put(ch, data.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer> occur : data.entrySet()){
            System.out.println(occur.getKey() + " " + occur.getValue());
        }
    }

    public static class Practice04 {
        // common Element

        public static void main(String[] args) {
            int arr1 [] = {2,3,4,5,6};
            int arr2 [] = {5,6,7,8,9};

            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> commonSet = new HashSet<>();

            for(int num : arr1){
                set.add(num);
            }
            System.out.println(set);

            for(int element : arr2){
                if(set.contains(element)){
                    commonSet.add(element);
                }
            }
            System.out.println(" Common Element " + commonSet);
        }
    }
}
