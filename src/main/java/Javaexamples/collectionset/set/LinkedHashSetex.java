package Javaexamples.collectionset.set;

import java.util.*;

public class LinkedHashSetex {
    public static void main(String[] args) {

        LinkedHashSet lnkHashset = new LinkedHashSet();

        lnkHashset.add("element1");
        lnkHashset.add("element2");
        lnkHashset.add("element3");

        Iterator itr = lnkHashset.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }

    }
}