package arrayConcepts;

import java.util.HashSet;
import java.util.Set;

public class CommonElement {
    public static void main(String[] args) {

        int [] arr1 = {2,4,6,7,8};
        int [] arr2 = {1,3,5,7,9};

        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        // Add first Array Element to set
         for(int a : arr1) {
             set.add(a);
         }
        System.out.println(set);

         // iterate over array 2
         for(int element : arr2){
             if(set.contains(element)){
                 commonSet.add(element);
             }
         }
        System.out.println("Common Element " + commonSet);
    }
}
