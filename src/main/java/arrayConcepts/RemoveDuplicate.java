package arrayConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int arr [] = {2,3,4,5,6,3,4,9};

        // first we need to convert Array to set
        Set<Integer> set = new HashSet<>();
        for(int arr1 : arr){
            set.add(arr1);
        }
        // convert set to int array

        int result [] = new int[set.size()];
        int i = 0;
        for(Integer num : set){
            result[i++] = num; // auto-unboxing from Integer to int
        }
        // print result array
        System.out.println("Remove duplicate " + Arrays.toString(result));
    }
}
