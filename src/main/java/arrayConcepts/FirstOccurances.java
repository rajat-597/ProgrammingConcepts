package arrayConcepts;

import java.util.HashMap;
import java.util.Map;

public class FirstOccurances {
    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,4,5,5,6,6};

        HashMap<Integer, Integer> data = new HashMap<>();
        for (int num : arr){
            data.put(num, data.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : data.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
            }
        }
    }
}
