package Javaexamples.collectionset.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetex {
    public static void main(String[] args) {

        SortedSet treeSet  = new TreeSet();

        treeSet.add("element100");
        treeSet.add("element2");
        treeSet.add("element3");

        Iterator itr = treeSet.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }

    }
}
