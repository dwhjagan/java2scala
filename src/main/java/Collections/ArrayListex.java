package Collections;

import java.util.*;


public class ArrayListex {
    public static void main(String[] args) {

        List lnkLst = new LinkedList();

        lnkLst.add("element1");
        lnkLst.add("element2");
        lnkLst.add("element3");

        Iterator itr = lnkLst.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }

    }
}