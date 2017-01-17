package Javaexamples.collectionset.List;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
import java.util.*;

public class ArrayListexp {
    public static void main(String[] args) {

        List lnkLst1 = new LinkedList();

        lnkLst1.add("element1");
        lnkLst1.add("element2");
        lnkLst1.add("element3");

        Iterator itr = lnkLst1.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }

    }
}