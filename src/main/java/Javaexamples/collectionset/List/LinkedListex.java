package Javaexamples.collectionset.List;

import java.util.*;


public class LinkedListex {
    public static void main(String[] args) {

        List lnkLst = new  LinkedList();

        lnkLst.add("element100");
        lnkLst.add("element2");
        lnkLst.add("element3");

        Iterator itr = lnkLst.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }

    }
}