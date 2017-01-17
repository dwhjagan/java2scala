package Javaexamples.collectionset.set;

import java.util.*;
public class HashSetTreeSet {

    public static void main(String args[]) {
        int count[] = {34, 22, 10, 60, 30, 22,22,22};

        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int i = 0; i < 4; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            LinkedHashSet linkedHashset = new LinkedHashSet<Integer>(set);
            System.out.println("The sorted linkedHashset is:");
            System.out.println(linkedHashset);


            System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
            System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
        } catch (Exception e) {
        }
    }
}