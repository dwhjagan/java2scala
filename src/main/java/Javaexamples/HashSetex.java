package Javaexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetex {
    public static void main(String[] args) {

        Set hashSet  = new HashSet();

        hashSet.add("element1");
        hashSet.add("element2");
        hashSet.add("element3");

        Iterator itr = hashSet.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }

    }
}