package arrayConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(3);
        al.add(6);
        al.add(4);

        System.out.println(al);

        // convert it to set

        Set<Integer> set = new HashSet<>(al);
        System.out.println(set);

        // convert set back to list
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
